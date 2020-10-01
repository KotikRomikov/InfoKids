package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var db: DatabaseHelper
        lateinit var city: String
        lateinit var database : SQLiteDatabase
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        db = DatabaseHelper(this)
        Log.d("1", this.getDatabasePath("info.db").absolutePath)
        db.updateDatabase()
        database = db.readableDatabase

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

        floating_action_button.setOnClickListener{

        }
    }

    // Обработка двойного нажатия кнопки "BACK" для выхода из приложения
    private var backPress: Long = 0

    override fun onBackPressed() {
        if (backPress + 2000 > System.currentTimeMillis()) {
            database.close()
            super.onBackPressed()
        } else {
            backPress = System.currentTimeMillis()
            Toast.makeText(
                baseContext,
                " Для выхода нажмите кнопку Назад еще раз",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}