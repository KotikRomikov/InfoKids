package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.other.SeveromorskOtherHireActivity
import com.dprk.infokids51.severomorsk.other.SeveromorskOtherNanniesPrivateKindergartensActivity
import kotlinx.android.synthetic.main.activity_severomorsk_other.*

class SeveromorskOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_other)


        hire.setOnClickListener {
            val hireIntent = Intent(this, SeveromorskOtherHireActivity::class.java)
            startActivity(hireIntent)
        }
        nannies.setOnClickListener {
            val nanniesIntent =
                Intent(this, SeveromorskOtherNanniesPrivateKindergartensActivity::class.java)
            startActivity(nanniesIntent)
        }
    }
}