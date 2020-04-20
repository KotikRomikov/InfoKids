package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.hobby.*

class SeveromorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this,SeveromorskHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }

    fun hobby_development_centre(view: View) {
        val hobbyDevelopmentCentreIntent = Intent(this,SeveromorskHobbyDevelopmentCentreActivity::class.java)
        startActivity(hobbyDevelopmentCentreIntent)
    }

    fun tutors(view: View) {
        val tutorsIntent = Intent(this,SeveromorskHobbyTutorsActivity::class.java)
        startActivity(tutorsIntent)
    }
    fun sportSection(view: View) {
        val sportSectionIntent = Intent(this,SeveromorskHobbySportSectionActivity::class.java)
        startActivity(sportSectionIntent)
    }
    fun technical(view: View) {
        val technicalIntent = Intent(this, SeveromorskHobbyTechnicalActivity::class.java)
        startActivity(technicalIntent)
    }
    fun choreography(view: View) {
        val choreographyIntent = Intent(this,SeveromorskHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }
    fun languages(view: View) {
        val languagesIntent = Intent(this,SeveromorskHobbyLanguagesActivity::class.java)
        startActivity(languagesIntent)
    }
}
