package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.hobby.*
import kotlinx.android.synthetic.main.activity_monchegorsk_hobby.*

class MonchegorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_hobby)


         cipr.setOnClickListener {
            val ciprIntent = Intent(this, MonchegorskHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

         development_centre.setOnClickListener {
            val development_centreIntent =
                Intent(this, MonchegorskHobbyDevelopmentCentreActivity::class.java)
            startActivity(development_centreIntent)
        }

         tutors.setOnClickListener {
            val tutorsIntent = Intent(this, MonchegorskHobbyTutorsActivity::class.java)
            startActivity(tutorsIntent)
        }

         sport.setOnClickListener {
            val sportIntent = Intent(this, MonchegorskHobbySportActivity::class.java)
            startActivity(sportIntent)
        }

         technical.setOnClickListener {
            val technicalIntent = Intent(this, MonchegorskHobbyTechnicalActivity::class.java)
            startActivity(technicalIntent)
        }

         choreography.setOnClickListener {
            val choreographyIntent = Intent(this, MonchegorskHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

         music_vocal.setOnClickListener {
            val music_vocalIntent = Intent(this, MonchegorskHobbyMusicVocalActivity::class.java)
            startActivity(music_vocalIntent)
        }

         languages.setOnClickListener {
            val languagesIntent = Intent(this, MonchegorskHobbyLanguagesActivity::class.java)
            startActivity(languagesIntent)
        }
    }
}