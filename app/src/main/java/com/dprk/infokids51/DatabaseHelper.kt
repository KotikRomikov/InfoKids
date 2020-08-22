package com.dprk.infokids51

import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.*


class DatabaseHelper(context: Context) : SQLiteOpenHelper (context, DB_NAME, null, DB_VERSION){

    companion object {
        val DB_NAME = "info.db"
        val DB_VERSION = 2
    }

    var DB_PATH = context.applicationInfo.dataDir + "/databases/"


    var mNeedUpdate = false
    var mDataBase: SQLiteDatabase? = null
    private var mContext = context

    //Копирование БД из папки assets на устройство
    @Throws(IOException::class)
    private fun copyDBFile() {
        Log.d("COPY FILE BASE", "START")
        val mInput: InputStream = mContext.assets.open(DB_NAME)
        //InputStream mInput = mContext.getResources().openRawResource(R.raw.info);
        val mOutput: OutputStream = FileOutputStream(DB_PATH + DB_NAME)
        val mBuffer = ByteArray(1024)
        var mLength: Int
        while (mInput.read(mBuffer).also { mLength = it } > 0) mOutput.write(mBuffer, 0, mLength)
        mOutput.flush()
        mOutput.close()
        mInput.close()
    }

    //тестовое открытие БД
    @Throws(SQLException::class)
    fun openDataBase(): Boolean {
        Log.d("OPEN BASE", "START")
        mDataBase =
            SQLiteDatabase.openDatabase(DB_PATH + DB_NAME, null, SQLiteDatabase.OPEN_READONLY)
        return mDataBase != null
    }

    //Обязательная функция
    override fun onCreate(db: SQLiteDatabase?) {    }

    //Обновление БД при первом запуске приложения и переустановки обновленной
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, DB_VERSION : Int) {
        Log.d("onUpgrade DB", "START")
        if (oldVersion < DB_VERSION) {
            val dbFile = File(DB_PATH + DB_NAME)
            if (dbFile.exists()) {
                dbFile.delete()
                Log.d("UPDATE DB", "DELETE OLD DB")
                try {
                    copyDBFile()
                } catch (mIOException: IOException) {
                    throw Error("ErrorCopyingDataBase")
                }
            }
        }
    }

    //Синхронизация сделана по рекомендациям, на сколько обязательна не знаю
    @Synchronized
    override fun close() {
        if (mDataBase != null) mDataBase!!.close()
        super.close()
    }

    fun start(){
        if (File(DB_PATH+DB_NAME).exists()) {
            Log.d("TEST", "File $DB_NAME EXISTS")
        }
        else{
            Log.d("TEST", "File $DB_NAME NOT EXISTS")
            this.readableDatabase
            this.close()
            try {
                copyDBFile()
            } catch (mIOException: IOException) {
                throw Error("ErrorCopyingDataBase")
            }
        }
    }

}