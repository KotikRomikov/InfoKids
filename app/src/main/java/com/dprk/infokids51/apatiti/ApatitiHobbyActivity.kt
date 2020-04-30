package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.hobby.*
import com.dprk.infokids51.murmansk.hobby.*

class ApatitiHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
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
        val decorativeAppliedIntent = Intent(this, ApatitiHobbyDecorativeAppliedActivity::class.java)
        startActivity(decorativeAppliedIntent)
    }

    fun technical(view: View) {
        val technicalIntent = Intent(this, ApatitiHobbyTechActivity::class.java)
        startActivity(technicalIntent)
    }

    fun hobby_choreography(view: View) {
        val choreographyIntent = Intent(this, ApatitiHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }

    fun Languages(view: View) {
        val languageIntent = Intent(this, ApatitiHobbyLanguagesActivity::class.java)
        startActivity(languageIntent)
    }

    fun artwork(view: View) {
        val artWorkIntent = Intent(this, ApatitiHobbyArtWorkActivity::class.java)
        startActivity(artWorkIntent)
    }

    fun centerOfDevelopment(view: View) {
        val centerOfDevelopmentIntent = Intent(this, ApatitiHobbyCenterOfDevelopmentActivity::class.java)
        startActivity(centerOfDevelopmentIntent)
    }
    fun SportsSection(view: View) {
        val sportsSectionIntent = Intent(this, ApatitiHobbySportsSectionActivity::class.java)
        startActivity(sportsSectionIntent)
    }
}
