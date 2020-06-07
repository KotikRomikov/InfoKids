package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyCenterOfDevelopmentActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyChoreographyActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyCiprActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbySportsSectionActivity
import kotlinx.android.synthetic.main.activity_olenegorsk_hobby.*

class OlenegorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_hobby)


         cipr.setOnClickListener {
            val ciprIntent = Intent(this, OlenegorskHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

         center_of_development.setOnClickListener {
            val centerOfDevelopmentIntent =
                Intent(this, OlenegorskHobbyCenterOfDevelopmentActivity::class.java)
            startActivity(centerOfDevelopmentIntent)
        }

         choreography.setOnClickListener {
            val choreographyIntent = Intent(this, OlenegorskHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

         sport_section.setOnClickListener {
            val sportSectionIntent = Intent(this, OlenegorskHobbySportsSectionActivity::class.java)
            startActivity(sportSectionIntent)
        }
    }
}