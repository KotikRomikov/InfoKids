package com.example.infokids.apatiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.apatiti.other.ApatitiOtherHireActivity
import com.example.infokids.apatiti.other.ApatitiOtherNanniesActivity

class ApatitiOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_other)
    }

    fun hire(view: View) {
        val hireIntent = Intent(this,ApatitiOtherHireActivity::class.java)
        startActivity(hireIntent)
    }
    fun nannies(view: View) {
        val nanniesIntent = Intent(this,ApatitiOtherNanniesActivity::class.java)
        startActivity(nanniesIntent)
    }
}
