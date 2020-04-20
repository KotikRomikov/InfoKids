package com.dprk.infokids51.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.hobby.*

class KandalakshaHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kandalaksha_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this,KandalakshaHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }
    fun development_centre(view: View) {
        val development_centreIntent = Intent(this,KandalakshaHobbyDevelopmentCentreActivity::class.java)
        startActivity(development_centreIntent)
    }
    fun sport_section(view: View) {
        val sport_sectionIntent = Intent(this,KandalakshaHobbySportActivity::class.java)
        startActivity(sport_sectionIntent)
    }
    fun choreography(view: View) {
        val choreographyIntent = Intent(this,KandalakshaHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }
    fun music_vocal(view: View) {
        val music_vocalIntent =  Intent(this,KandalakshaHobbyMusicVocalActivity::class.java)
        startActivity(music_vocalIntent)
    }
    fun art_work(view: View) {
        val art_workIntent = Intent(this,KandalakshaHobbyArtWorkActivity::class.java)
        startActivity(art_workIntent)
    }
}
