package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var db: SQLiteDatabase
        lateinit var city: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Запускаем обновление БД если это необходимо
        try {
            DatabaseHelper(this).start()
        } catch (mIOException: IOException) {
            throw Error("UnableToUpdateDatabase")
        }

        //подключаемся к БД в жежиме чтения
        try {
            db = SQLiteDatabase.openDatabase(
                this.filesDir.path + "/info.db",
                null,
                SQLiteDatabase.OPEN_READONLY
            )
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }

        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main)

        val menuIntent = Intent(this, MainRazdelActivity::class.java)

        tvMRM.setOnClickListener {
            city = "MRM"
            startActivity(menuIntent)
        }
        tvSVR.setOnClickListener {
            city = "SVR"
            startActivity(menuIntent)
        }
        tvLNG.setOnClickListener {
            city = "LNG"
            startActivity(menuIntent)
        }
        tvMNC.setOnClickListener {
            city = "MNC"
            startActivity(menuIntent)
        }
        tvKRV.setOnClickListener {
            city = "KRV"
            startActivity(menuIntent)
        }
        tvPTT.setOnClickListener {
            city = "PTT"
            startActivity(menuIntent)
        }
        tvPLR.setOnClickListener {
            city = "PLR"
            startActivity(menuIntent)
        }
        tvKND.setOnClickListener {
            city = "KND"
            startActivity(menuIntent)
        }
    }


}