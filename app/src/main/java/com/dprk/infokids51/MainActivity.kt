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
        lateinit var db : SQLiteDatabase
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
            db = DatabaseHelper(this).readableDatabase
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }

        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main)

        // testActivity


        MenuButton.setOnClickListener {
            val menuIntent = Intent(this, MenuActivity::class.java)
            startActivity(menuIntent)
        }
    }
}