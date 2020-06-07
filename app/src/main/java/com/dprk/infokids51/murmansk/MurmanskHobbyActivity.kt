package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.hobby.*
import kotlinx.android.synthetic.main.activity_murmansk_hobby.*

class MurmanskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_hobby)


         murmansk_hobby_cipr.setOnClickListener {
            val murmanskHobbyCiprIntent = Intent(this, MurmanskHobbyCiprActivity::class.java)
            startActivity(murmanskHobbyCiprIntent)
        }

         murmansk_hobby_development_centre.setOnClickListener {
            val murmanskHobbyDevelopmentCentreIntent =
                Intent(this, MurmanskHobbyDevelopmentCentreActivity::class.java)
            startActivity(murmanskHobbyDevelopmentCentreIntent)
        }

         murmansk_hobby_tutors.setOnClickListener {
            val tutorsIntent = Intent(this, MurmanskHobbyTutorsActivity::class.java)
            startActivity(tutorsIntent)
        }

         DecorativeApplied.setOnClickListener {
            val decorativeAppliedIntent =
                Intent(this, MurmanskHobbyDecorativeAppliedActivity::class.java)
            startActivity(decorativeAppliedIntent)
        }

         technical.setOnClickListener {
            val technicalIntent = Intent(this, MurmanskHobbyTechActivity::class.java)
            startActivity(technicalIntent)
        }

         hobby_choreography.setOnClickListener {
            val choreographyIntent = Intent(this, MurmanskHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

         MusicVocal.setOnClickListener {
            val musicVocalIntent = Intent(this, MurmanskHobbyMusicVocalActivity::class.java)
            startActivity(musicVocalIntent)
        }

         Languages.setOnClickListener {
            val languageIntent = Intent(this, MurmanskHobbyLanguagesActivity::class.java)
            startActivity(languageIntent)
        }

         artwork.setOnClickListener {
            val artWorkIntent = Intent(this, MurmanskHobbyArtWorkActivity::class.java)
            startActivity(artWorkIntent)
        }

         SportsSection.setOnClickListener {
            val sportsSectionIntent = Intent(this, MurmanskHobbySportsSectionActivity::class.java)
            startActivity(sportsSectionIntent)
        }
    }
}