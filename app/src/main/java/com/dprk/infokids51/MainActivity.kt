package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        var MenuButtonID: Long = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main)

        // testActivity


        MenuButton.setOnClickListener {
            MenuButtonID = MenuButton.id.toLong()
            Toast.makeText(this, "$MenuButtonID", Toast.LENGTH_SHORT).show()
            val menuIntent = Intent(this, MenuActivity::class.java)
            startActivity(menuIntent)
//             val testIntent = Intent(this, TestActivity::class.java)
//             startActivity(testIntent)
        }
    }
}