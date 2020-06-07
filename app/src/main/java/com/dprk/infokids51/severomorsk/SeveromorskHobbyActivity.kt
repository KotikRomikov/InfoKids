package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.hobby.*
import kotlinx.android.synthetic.main.activity_severomorsk_hobby.*

class SeveromorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_hobby)


         cipr.setOnClickListener {
            val ciprIntent = Intent(this, SeveromorskHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

         hobby_development_centre.setOnClickListener {
            val hobbyDevelopmentCentreIntent =
                Intent(this, SeveromorskHobbyDevelopmentCentreActivity::class.java)
            startActivity(hobbyDevelopmentCentreIntent)
        }

         tutors.setOnClickListener {
            val tutorsIntent = Intent(this, SeveromorskHobbyTutorsActivity::class.java)
            startActivity(tutorsIntent)
        }

         sportSection.setOnClickListener {
            val sportSectionIntent = Intent(this, SeveromorskHobbySportSectionActivity::class.java)
            startActivity(sportSectionIntent)
        }

         technical.setOnClickListener {
            val technicalIntent = Intent(this, SeveromorskHobbyTechnicalActivity::class.java)
            startActivity(technicalIntent)
        }

         choreography.setOnClickListener {
            val choreographyIntent = Intent(this, SeveromorskHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

         languages.setOnClickListener {
            val languagesIntent = Intent(this, SeveromorskHobbyLanguagesActivity::class.java)
            startActivity(languagesIntent)
        }
    }
}