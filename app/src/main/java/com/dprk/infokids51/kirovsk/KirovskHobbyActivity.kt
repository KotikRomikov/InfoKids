package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.hobby.*
import kotlinx.android.synthetic.main.activity_kirovsk_hobby.*

class KirovskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_hobby)

        Cipr.setOnClickListener {
            val ciprIntent = Intent(this, KirovskHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

        developmentCentre.setOnClickListener {
            val developmentCentreIntent =
                Intent(this, KirovskHobbyDevelompentCentreActivity::class.java)
            startActivity(developmentCentreIntent)
        }

        sport.setOnClickListener {
            val sportIntent = Intent(this, KirovskHobbySportActivity::class.java)
            startActivity(sportIntent)
        }
        technical.setOnClickListener {
            val technicalIntent = Intent(this, KirovskHobbyTechnicalActivity::class.java)
            startActivity(technicalIntent)
        }
        choreography.setOnClickListener {
            val choreographyIntent = Intent(this, KirovskHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }
        languages.setOnClickListener {
            val languagesIntent = Intent(this, KirovskHobbyLanguageActivity::class.java)
            startActivity(languagesIntent)
        }
    }
}