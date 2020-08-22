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
        var MenuButtonID: Long = 0
        lateinit var db : SQLiteDatabase
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            DatabaseHelper(this).start()
        } catch (mIOException: IOException) {
            throw Error("UnableToUpdateDatabase")
        }

        try {
            db = DatabaseHelper(this).readableDatabase
        } catch (mSQLException: SQLException) {
            throw mSQLException
        }

        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main)

        // testActivity


        MenuButton.setOnClickListener {
            MenuButtonID = MenuButton.id.toLong()


            //Toast.makeText(this, "$MenuButtonID", Toast.LENGTH_SHORT).show()
            val menuIntent = Intent(this, MenuActivity::class.java)
            startActivity(menuIntent)
//             val testIntent = Intent(this, TestActivity::class.java)
//             startActivity(testIntent)
        }
    }
}