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
        val DB_VERSION = 1
    }

    var DB_PATH = context.applicationInfo.dataDir + "/databases/"


    var mNeedUpdate = false
    var mDataBase: SQLiteDatabase? = null
    private var mContext = context

    @Throws(IOException::class)
    fun updateDB() {
        Log.d("UPDATE DB", "START")
        if (mNeedUpdate) {
            val dbFile = File(DB_PATH + DB_NAME)
            if (dbFile.exists()) {
                dbFile.delete()
                Log.d("UPDATE DB", "DELETE OLD DB")
            }
            copyDB()
            mNeedUpdate = false
        }
    }

    //Копирование
    fun copyDB () {
        Log.d("COPY BASE", "START")
        if (!checkDb()) {
            this.readableDatabase
            this.close()
            try {
                copyDBFile()
            } catch (mIOException: IOException) {
                throw Error("ErrorCopyingDataBase")
            }
        }
    }

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

    //Проверка существования BD в папке программы
    private fun checkDb(): Boolean {
        Log.d("CHECK BASE", "START")
        val dbFile = File(DB_PATH+DB_NAME)
        Log.d("CHECK BASE", dbFile.exists().toString())
        return dbFile.exists()
    }

    //тестовое открытие БД
    @Throws(SQLException::class)
    fun openDataBase(): Boolean {
        Log.d("OPEN BASE", "START")
        mDataBase =
            SQLiteDatabase.openDatabase(DB_PATH + DB_NAME, null, SQLiteDatabase.CREATE_IF_NECESSARY)
        return mDataBase != null
    }

    //Обязательная функция
    override fun onCreate(db: SQLiteDatabase?) {    }

    //Обновление БД при первом запуске приложения и переустановки обновленной
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, DB_VERSION : Int) {
        Log.d("onUpgrade DB", "START")
        if (oldVersion < DB_VERSION) {
            mNeedUpdate = true
            copyDB()
        }
    }

    //Синхронизация сделана по рекомендациям, на сколько обязательна не знаю
    @Synchronized
    override fun close() {
        if (mDataBase != null) mDataBase!!.close()
        super.close()
    }
}