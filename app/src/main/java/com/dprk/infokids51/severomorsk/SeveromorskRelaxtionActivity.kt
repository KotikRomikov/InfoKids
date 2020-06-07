package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionGamePlaceActivity
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionKidsOrganizationActivity
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionSportActivity
import kotlinx.android.synthetic.main.activity_severomorsk_relaxtion.*

class SeveromorskRelaxtionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_relaxtion)


         game_place.setOnClickListener {
            val gamePlaceIntent = Intent(this, SeveromorskRelaxtionGamePlaceActivity::class.java)
            startActivity(gamePlaceIntent)
        }

         sport_relaxion.setOnClickListener {
            val sportIntent = Intent(this, SeveromorskRelaxtionSportActivity::class.java)
            startActivity(sportIntent)
        }

         kids_organization.setOnClickListener {
            val kidsOrganizationIntent =
                Intent(this, SeveromorskRelaxtionKidsOrganizationActivity::class.java)
            startActivity(kidsOrganizationIntent)
        }
    }
}