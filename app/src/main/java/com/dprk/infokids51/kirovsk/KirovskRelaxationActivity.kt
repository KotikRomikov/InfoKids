package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.relaxation.KirovskRelaxationGamePlaceActivity
import com.dprk.infokids51.kirovsk.relaxation.KirovskRelaxationSportActivity
import kotlinx.android.synthetic.main.activity_kirovsk_relaxation.*

class KirovskRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_relaxation)


         gamePlace.setOnClickListener {
            val gamePlaceIntent = Intent(this, KirovskRelaxationGamePlaceActivity::class.java)
            startActivity(gamePlaceIntent)
        }

         sport.setOnClickListener {
            val sportIntent = Intent(this, KirovskRelaxationSportActivity::class.java)
            startActivity(sportIntent)
        }
    }
}