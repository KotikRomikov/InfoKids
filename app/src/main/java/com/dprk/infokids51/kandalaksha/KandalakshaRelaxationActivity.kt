package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.relaxation.*
import kotlinx.android.synthetic.main.activity_kandalaksha_relaxation.*

class KandalakshaRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_relaxation)


         sport.setOnClickListener {
            val sportIntent = Intent(this, KandalakshaRelaxationSportActivity::class.java)
            startActivity(sportIntent)
        }

         cafe.setOnClickListener {
            val cafeIntent = Intent(this, KandalakshaRelaxationCafeActivity::class.java)
            startActivity(cafeIntent)
        }

         kids_organization.setOnClickListener {
            val kids_organizationIntent =
                Intent(this, KandalakshaRelaxationKidsOrganizationActivity::class.java)
            startActivity(kids_organizationIntent)
        }

         game_place.setOnClickListener {
            val game_placeIntent = Intent(this, KandalakshaRelaxationGamePlaceActivity::class.java)
            startActivity(game_placeIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, KandalakshaRelaxationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}