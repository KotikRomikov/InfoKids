package com.dprk.infokids51.olenegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyCenterOfDevelopmentActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyChoreographyActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbyCiprActivity
import com.dprk.infokids51.olenegorsk.hobby.OlenegorskHobbySportsSectionActivity

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
