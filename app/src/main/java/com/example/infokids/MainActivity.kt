package com.example.infokids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun MenuButton(view: View) {
        val menuIntent = Intent(this,MenuActivity::class.java)
        startActivity(menuIntent)
    }
}
