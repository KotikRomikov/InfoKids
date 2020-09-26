package com.dprk.infokids51

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.*

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        const val DB_NAME = "info.db"
        const val DB_VERSION = 1
    }

    private var mContext = context
    private var OLD_VERSION: Int = 0

    @SuppressLint("SdCardPath")
    private val DB_PATH = "/data/user/0/com.dprk.infokids51/databases/"

    fun updateDatabase(){
        if (OLD_VERSION != DB_VERSION) {
            File(DB_PATH+ DB_NAME).delete()
            Log.d("TEST", "OLD_VERSION=$OLD_VERSION NEW_VERSION=$DB_VERSION")
            copyDBFile()
        }
    }

    //Копирование БД из папки assets на устройство
    @Throws(IOException::class)
    private fun copyDBFile() {
        Log.d("COPY FILE BASE", "START")
        val mInput: InputStream = mContext.assets.open(DB_NAME)
        Log.d("COPY FILE BASE", "INPUT STREAM")
        //InputStream mInput = mContext.getResources().openRawResource(R.raw.info);
        val mOutput: OutputStream = FileOutputStream(DB_PATH + DB_NAME)
        Log.d("COPY FILE BASE", "OUTPUT STREAM")
        val mBuffer = ByteArray(1024)
        var mLength: Int
        while (mInput.read(mBuffer).also { mLength = it } > 0) mOutput.write(mBuffer, 0, mLength)
        mOutput.flush()
        mOutput.close()
        mInput.close()
        Log.d("COPY FILE BASE", "FINISH")
    }

    override fun onCreate(db: SQLiteDatabase?) {}

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        Log.d("DB UPGRADE", "START")
        OLD_VERSION = oldVersion
    }

    override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        OLD_VERSION = oldVersion
        Log.d("DB DOWNGRADE", "START")
    }
}
