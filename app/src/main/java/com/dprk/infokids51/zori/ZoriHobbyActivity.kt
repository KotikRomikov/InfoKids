package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.hobby.*
import kotlinx.android.synthetic.main.activity_zori_hobby.*

class ZoriHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_hobby)


         cipr.setOnClickListener {
            val ciprIntent = Intent(this, ZoriHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

         developmentCentre.setOnClickListener {
            val developmentCentreIntent =
                Intent(this, ZoriHobbyDevelopmentCentreActivity::class.java)
            startActivity(developmentCentreIntent)
        }

         tutors.setOnClickListener {
            val tutorsIntent = Intent(this, ZoriHobbyTutorsActivity::class.java)
            startActivity(tutorsIntent)
        }

         sport.setOnClickListener {
            val sportIntent = Intent(this, ZoriHobbySportActivity::class.java)
            startActivity(sportIntent)
        }

         technical.setOnClickListener {
            val technicalIntent = Intent(this, ZoriHobbyTechnicalActivity::class.java)
            startActivity(technicalIntent)
        }

         musicVocal.setOnClickListener {
            val musicVocalIntent = Intent(this, ZoriHobbyMusicVocalActivity::class.java)
            startActivity(musicVocalIntent)
        }

         theatre.setOnClickListener {
            val theatreIntent = Intent(this, ZoriHobbyTheatreActivity::class.java)
            startActivity(theatreIntent)
        }

         language.setOnClickListener {
            val languageIntent = Intent(this, ZoriHobbyLanguageActivity::class.java)
            startActivity(languageIntent)
        }
    }
}