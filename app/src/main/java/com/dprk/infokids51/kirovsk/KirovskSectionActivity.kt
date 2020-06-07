package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_kirovsk_section.*

class KirovskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_section)


         OtherSection.setOnClickListener {
            val otherIntent = Intent(this, KirovskOtherActivity::class.java)
            startActivity(otherIntent)
        }

         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, KirovskFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, KirovskCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         HobbySection.setOnClickListener {
            val hobbyIntent = Intent(this, KirovskHobbyActivity::class.java)
            startActivity(hobbyIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, KirovskShopActivity::class.java)
            startActivity(shopIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxationIntent = Intent(this, KirovskRelaxationActivity::class.java)
            startActivity(relaxationIntent)
        }

         MedicalSection.setOnClickListener {
            val medicalIntent = Intent(this, KirovskMedicalActivity::class.java)
            startActivity(medicalIntent)
        }
    }
}