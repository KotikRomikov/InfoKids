package com.example.infokids.olenegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.olenegorsk.hobby.OlenegorskHobbyCenterOfDevelopmentActivity
import com.example.infokids.olenegorsk.hobby.OlenegorskHobbyChoreographyActivity
import com.example.infokids.olenegorsk.hobby.OlenegorskHobbyCiprActivity
import com.example.infokids.olenegorsk.hobby.OlenegorskHobbySportsSectionActivity

class OlenegorskHobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olenegorsk_hobby)
    }

    fun cipr(view: View) {
        val ciprIntent = Intent(this,OlenegorskHobbyCiprActivity::class.java)
        startActivity(ciprIntent)
    }

    fun center_of_development(view: View) {
        val centerOfDevelopmentIntent = Intent(this,OlenegorskHobbyCenterOfDevelopmentActivity::class.java)
        startActivity(centerOfDevelopmentIntent)
    }
    fun choreography(view: View) {
        val choreographyIntent = Intent(this,OlenegorskHobbyChoreographyActivity::class.java)
        startActivity(choreographyIntent)
    }
    fun sport_section(view: View) {
        val sportSectionIntent = Intent(this,OlenegorskHobbySportsSectionActivity::class.java)
        startActivity(sportSectionIntent)
    }
}
