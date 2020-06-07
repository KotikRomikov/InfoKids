package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.hobby.*
import kotlinx.android.synthetic.main.activity_apatiti_hobby.*

class ApatitiHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_hobby)


        apatiti_hobby_cipr.setOnClickListener {
            val apatitiHobbyCiprIntent = Intent(this, ApatitiHobbyCiprActivity::class.java)
            startActivity(apatitiHobbyCiprIntent)
        }

        apatiti_hobby_development_centre.setOnClickListener {
            val apatitiHobbyDevelopmentCentreIntent =
                Intent(this, ApatitiHobbyDevelopmentCentreActivity::class.java)
            startActivity(apatitiHobbyDevelopmentCentreIntent)
        }

        apatiti_hobby_tutors.setOnClickListener {
            val tutorsIntent = Intent(this, ApatitiHobbyTutorsActivity::class.java)
            startActivity(tutorsIntent)
        }

        DecorativeApplied.setOnClickListener {
            val decorativeAppliedIntent =
                Intent(this, ApatitiHobbyDecorativeAppliedActivity::class.java)
            startActivity(decorativeAppliedIntent)
        }

        technical.setOnClickListener {
            val technicalIntent = Intent(this, ApatitiHobbyTechActivity::class.java)
            startActivity(technicalIntent)
        }

        hobby_choreography.setOnClickListener {
            val choreographyIntent = Intent(this, ApatitiHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

        Languages.setOnClickListener {
            val languageIntent = Intent(this, ApatitiHobbyLanguagesActivity::class.java)
            startActivity(languageIntent)
        }

        artwork.setOnClickListener {
            val artWorkIntent = Intent(this, ApatitiHobbyArtWorkActivity::class.java)
            startActivity(artWorkIntent)
        }

        SportsSection.setOnClickListener {
            val sportsSectionIntent = Intent(this, ApatitiHobbySportsSectionActivity::class.java)
            startActivity(sportsSectionIntent)
        }
    }
}