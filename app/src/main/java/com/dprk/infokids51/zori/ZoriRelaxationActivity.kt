package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationCafeActivity
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationOtherActivity
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationSportActivity
import kotlinx.android.synthetic.main.activity_zori_relaxation.*

class ZoriRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_relaxation)


         sport.setOnClickListener {
            val sportIntent = Intent(this, ZoriRelaxationSportActivity::class.java)
            startActivity(sportIntent)
        }

         cafe.setOnClickListener {
            val cafeIntent = Intent(this, ZoriRelaxationCafeActivity::class.java)
            startActivity(cafeIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, ZoriRelaxationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}