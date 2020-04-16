package com.example.infokids.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kirovsk.hobby.*

class KirovskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this,KirovskHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }
    fun developmentCentre(view: View) {
        val developmentCentreIntent = Intent(this,KirovskHobbyDevelompentCentreActivity::class.java)
        startActivity(developmentCentreIntent)
    }
    fun sport(view: View) {
        val sportIntent = Intent(this,KirovskHobbySportActivity::class.java)
        startActivity(sportIntent)
    }
    fun technical(view: View) {
        val technicalIntent = Intent(this,KirovskHobbyTechnicalActivity::class.java)
        startActivity(technicalIntent)
    }
    fun choreography(view: View) {
        val choreographyIntent = Intent(this,KirovskHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }
    fun languages(view: View) {
        val languagesIntent = Intent(this,KirovskHobbyLanguageActivity::class.java)
        startActivity(languagesIntent)
    }
}
