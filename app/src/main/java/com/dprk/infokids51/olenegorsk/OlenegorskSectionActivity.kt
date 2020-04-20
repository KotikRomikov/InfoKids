package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class OlenegorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_section)
    }

    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,OlenegorskFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,OlenegorskCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
    fun HobbySection(view: View) {
        val hobbyIntent = Intent(this,OlenegorskHobbyActivity::class.java)
        startActivity(hobbyIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,OlenegorskShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxationIntent = Intent(this,OlenegorskRalaxationActivity::class.java)
        startActivity(relaxationIntent)
    }
    fun MedicalSection(view: View) {
        val medicalIntent = Intent(this,OlenegorskMedicalActivity::class.java)
        startActivity(medicalIntent)
    }
}
