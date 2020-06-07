package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.hobby.*
import kotlinx.android.synthetic.main.activity_kandalaksha_hobby.*

class KandalakshaHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_hobby)


         cipr.setOnClickListener {
            val ciprIntent = Intent(this, KandalakshaHobbyCiprActivity::class.java)
            startActivity(ciprIntent)
        }

         development_centre.setOnClickListener {
            val development_centreIntent =
                Intent(this, KandalakshaHobbyDevelopmentCentreActivity::class.java)
            startActivity(development_centreIntent)
        }

         sport_section.setOnClickListener {
            val sport_sectionIntent = Intent(this, KandalakshaHobbySportActivity::class.java)
            startActivity(sport_sectionIntent)
        }

         choreography.setOnClickListener {
            val choreographyIntent = Intent(this, KandalakshaHobbyChoreographyActivity::class.java)
            startActivity(choreographyIntent)
        }

         music_vocal.setOnClickListener {
            val music_vocalIntent = Intent(this, KandalakshaHobbyMusicVocalActivity::class.java)
            startActivity(music_vocalIntent)
        }

         art_work.setOnClickListener {
            val art_workIntent = Intent(this, KandalakshaHobbyArtWorkActivity::class.java)
            startActivity(art_workIntent)
        }
    }
}