package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationCafeActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationGamePlaceActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationOtherActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationSportActivity
import kotlinx.android.synthetic.main.activity_monchegorsk_relaxation.*

class MonchegorskRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_relaxation)


         sport_relaxion.setOnClickListener {
            val sportIntent = Intent(this, MonchegorskRelaxationSportActivity::class.java)
            startActivity(sportIntent)
        }

         game_place.setOnClickListener {
            val gamePlaceIntent = Intent(this, MonchegorskRelaxationGamePlaceActivity::class.java)
            startActivity(gamePlaceIntent)
        }

         relaxation_cafe.setOnClickListener {
            val cafeIntent = Intent(this, MonchegorskRelaxationCafeActivity::class.java)
            startActivity(cafeIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, MonchegorskRelaxationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}