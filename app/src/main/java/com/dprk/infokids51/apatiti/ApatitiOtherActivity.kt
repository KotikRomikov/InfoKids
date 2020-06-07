package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.other.ApatitiOtherHireActivity
import com.dprk.infokids51.apatiti.other.ApatitiOtherNanniesActivity
import kotlinx.android.synthetic.main.activity_apatiti_other.*

class ApatitiOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_other)


        hire.setOnClickListener {
            val hireIntent = Intent(this, ApatitiOtherHireActivity::class.java)
            startActivity(hireIntent)
        }

        nannies.setOnClickListener {
            val nanniesIntent = Intent(this, ApatitiOtherNanniesActivity::class.java)
            startActivity(nanniesIntent)
        }
    }
}