package com.dprk.infokids51.apatiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.hobby.ApatitiHobbyCiprActivity
import com.dprk.infokids51.apatiti.hobby.ApatitiHobbyDevelopmentCentreActivity
import com.dprk.infokids51.apatiti.hobby.ApatitiHobbySportsSectionActivity
import com.dprk.infokids51.apatiti.hobby.ApatitiHobbyTutorsActivity
import com.dprk.infokids51.murmansk.hobby.*

class ApatitiHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_hobby)
    }

    fun apatiti_hobby_cipr(view: View) {
        val apatitiHobbyCiprIntent = Intent(this, ApatitiHobbyCiprActivity::class.java)
        startActivity(apatitiHobbyCiprIntent)
    }

    fun apatiti_hobby_development_centre(view: View) {
        val apatitiHobbyDevelopmentCentreIntent = Intent(this, ApatitiHobbyDevelopmentCentreActivity::class.java)
        startActivity(apatitiHobbyDevelopmentCentreIntent)
    }

    fun apatiti_hobby_tutors(view: View) {
        val tutorsIntent = Intent(this, ApatitiHobbyTutorsActivity::class.java)
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

    fun centerOfDevelopment(view: View) {
        val centerOfDevelopmentIntent = Intent(this,MurmanskHobbyCenterOfDevelopmentActivity::class.java)
        startActivity(centerOfDevelopmentIntent)
    }
    fun SportsSection(view: View) {
        val sportsSectionIntent = Intent(this, ApatitiHobbySportsSectionActivity::class.java)
        startActivity(sportsSectionIntent)
    }
}
