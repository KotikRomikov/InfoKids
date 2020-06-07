package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_olenegorsk_section.*

class OlenegorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_section)


         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, OlenegorskFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, OlenegorskCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         HobbySection.setOnClickListener {
            val hobbyIntent = Intent(this, OlenegorskHobbyActivity::class.java)
            startActivity(hobbyIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, OlenegorskShopActivity::class.java)
            startActivity(shopIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxationIntent = Intent(this, OlenegorskRalaxationActivity::class.java)
            startActivity(relaxationIntent)
        }

         MedicalSection.setOnClickListener {
            val medicalIntent = Intent(this, OlenegorskMedicalActivity::class.java)
            startActivity(medicalIntent)
        }
    }
}