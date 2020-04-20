package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.hobby.*

class MonchegorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this,MonchegorskHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }
    fun development_centre(view: View) {
        val development_centreIntent = Intent(this,MonchegorskHobbyDevelopmentCentreActivity::class.java)
        startActivity(development_centreIntent)
    }
    fun tutors(view: View) {
        val tutorsIntent = Intent(this,MonchegorskHobbyTutorsActivity::class.java)
        startActivity(tutorsIntent)
    }
    fun sport(view: View) {
        val sportIntent = Intent(this,MonchegorskHobbySportActivity::class.java)
        startActivity(sportIntent)
    }
    fun technical(view: View) {
        val technicalIntent = Intent(this,MonchegorskHobbyTechnicalActivity::class.java)
        startActivity(technicalIntent)
    }
    fun choreography(view: View) {
        val choreographyIntent = Intent(this,MonchegorskHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }
    fun music_vocal(view: View) {
        val music_vocalIntent = Intent(this,MonchegorskHobbyMusicVocalActivity::class.java)
        startActivity(music_vocalIntent)
    }
    fun languages(view: View) {
        val languagesIntent = Intent(this,MonchegorskHobbyLanguagesActivity::class.java)
        startActivity(languagesIntent)
    }
}
