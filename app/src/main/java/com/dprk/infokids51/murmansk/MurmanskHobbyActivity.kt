package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.hobby.*

class MurmanskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_hobby)
    }

    fun murmansk_hobby_cipr(view: View) {
        val murmanskHobbyCiprIntent = Intent(this,MurmanskHobbyCiprActivity::class.java)
        startActivity(murmanskHobbyCiprIntent)
    }

    fun murmansk_hobby_development_centre(view: View) {
        val murmanskHobbyDevelopmentCentreIntent = Intent(this, MurmanskHobbyDevelopmentCentreActivity::class.java)
        startActivity(murmanskHobbyDevelopmentCentreIntent)
    }

    fun murmansk_hobby_tutors(view: View) {
        val tutorsIntent = Intent(this,MurmanskHobbyTutorsActivity::class.java)
        startActivity(tutorsIntent)
    }

    fun DecorativeApplied(view: View) {
        val decorativeAppliedIntent = Intent(this,MurmanskHobbyDecorativeAppliedActivity::class.java)
        startActivity(decorativeAppliedIntent)
    }

    fun technical(view: View) {
        val technicalIntent = Intent(this,MurmanskHobbyTechActivity::class.java)
        startActivity(technicalIntent)
    }

    fun hobby_choreography(view: View) {
        val choreographyIntent = Intent(this,MurmanskHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }

    fun MusicVocal(view: View) {
        val musicVocalIntent = Intent(this,MurmanskHobbyMusicVocalActivity::class.java)
        startActivity(musicVocalIntent)
    }

    fun Languages(view: View) {
        val languageIntent = Intent(this,MurmanskHobbyLanguagesActivity::class.java)
        startActivity(languageIntent)
    }

    fun artwork(view: View) {
        val artWorkIntent = Intent(this,MurmanskHobbyArtWorkActivity::class.java)
        startActivity(artWorkIntent)
    }

    fun SportsSection(view: View) {
        val sportsSectionIntent = Intent(this,MurmanskHobbySportsSectionActivity::class.java)
        startActivity(sportsSectionIntent)
    }
}
