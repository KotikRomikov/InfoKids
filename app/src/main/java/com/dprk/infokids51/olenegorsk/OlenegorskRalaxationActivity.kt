package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationCafeActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationGamePlaceActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationKidsOrganizationActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationOtherActivity
import kotlinx.android.synthetic.main.activity_olenegorsk_ralaxation.*

class OlenegorskRalaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_ralaxation)


         game_place.setOnClickListener {
            val gamePlaceIntent = Intent(this, OlenegorskRelaxationGamePlaceActivity::class.java)
            startActivity(gamePlaceIntent)
        }

         cafe.setOnClickListener {
            val cafeIntent = Intent(this, OlenegorskRelaxationCafeActivity::class.java)
            startActivity(cafeIntent)
        }

         kids_organization.setOnClickListener {
            val kidsOrganizationIntent =
                Intent(this, OlenegorskRelaxationKidsOrganizationActivity::class.java)
            startActivity(kidsOrganizationIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, OlenegorskRelaxationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}