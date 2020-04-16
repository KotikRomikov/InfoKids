package com.example.infokids.zori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.zori.hobby.*

class ZoriHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zori_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this, ZoriHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }
    fun developmentCentre(view: View) {
        val developmentCentreIntent = Intent(this, ZoriHobbyDevelopmentCentreActivity::class.java)
        startActivity(developmentCentreIntent)
    }
    fun tutors(view: View) {
        val tutorsIntent = Intent(this, ZoriHobbyTutorsActivity::class.java)
        startActivity(tutorsIntent)
    }
    fun sport(view: View) {
        val sportIntent = Intent(this, ZoriHobbySportActivity::class.java)
        startActivity(sportIntent)
    }
    fun technical(view: View) {
        val technicalIntent = Intent(this, ZoriHobbyTechnicalActivity::class.java)
        startActivity(technicalIntent)
    }
    fun musicVocal(view: View) {
        val musicVocalIntent = Intent(this, ZoriHobbyMusicVocalActivity::class.java)
        startActivity(musicVocalIntent)
    }
    fun theatre(view: View) {
        val theatreIntent = Intent(this, ZoriHobbyTheatreActivity::class.java)
        startActivity(theatreIntent)
    }
    fun language(view: View) {
        val languageIntent = Intent(this, ZoriHobbyLanguageActivity::class.java)
        startActivity(languageIntent)
    }
}
