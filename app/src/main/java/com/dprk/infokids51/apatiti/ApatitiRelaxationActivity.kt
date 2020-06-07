package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationCafeActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationGameCentreActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationKidsOrganizationActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationSportActivity
import kotlinx.android.synthetic.main.activity_apatiti_relaxation.*

class ApatitiRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_relaxation)

        gameCentre.setOnClickListener {
            val gameCentreIntent = Intent(this, ApatitiRelaxationGameCentreActivity::class.java)
            startActivity(gameCentreIntent)
        }

        sport.setOnClickListener {
            val sportIntent = Intent(this, ApatitiRelaxationSportActivity::class.java)
            startActivity(sportIntent)
        }

        cafe.setOnClickListener {
            val cafeIntent = Intent(this, ApatitiRelaxationCafeActivity::class.java)
            startActivity(cafeIntent)
        }

        kidsOrganization.setOnClickListener {
            val kidsOrganizationIntent =
                Intent(this, ApatitiRelaxationKidsOrganizationActivity::class.java)
            startActivity(kidsOrganizationIntent)
        }
    }
}