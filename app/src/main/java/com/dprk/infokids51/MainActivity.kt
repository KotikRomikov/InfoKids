package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


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
            val backIt = Intent(this, BackItActivity::class.java)
            startActivity(backIt)
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

/*
<TextView
            android:id="@+id/emailCompany"
            android:layout_width="wrap_content"
            android:layout_height="16dp"
            android:layout_above="@+id/telCompany"
            android:layout_alignParentStart="false"
            android:layout_alignParentEnd="false"
            android:layout_marginStart="16dp"
            android:layout_marginEnd="16dp"
            android:layout_marginBottom="4dp"
            android:autoLink="email"
            android:fontFamily="@font/roboto_condensed_regular"
            android:includeFontPadding="false"
            android:text="infokids@mail.ru"
            android:textColor="@color/testTextColor"
            android:textSize="16sp" />
 */