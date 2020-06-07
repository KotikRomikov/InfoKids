package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_apatiti_section.*

class ApatitiSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_section)


         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, ApatitiCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         MedicalSection.setOnClickListener {
            val medicalIntent = Intent(this, ApatitiMedicalActivity::class.java)
            startActivity(medicalIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxationIntent = Intent(this, ApatitiRelaxationActivity::class.java)
            startActivity(relaxationIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, ApatitiShopActivity::class.java)
            startActivity(shopIntent)
        }

         HobbySection.setOnClickListener {
            val HobbySectionIntent = Intent(this, ApatitiHobbyActivity::class.java)
            startActivity(HobbySectionIntent)
        }

         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, ApatitiFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         OtherSection.setOnClickListener {
            val otherIntent = Intent(this, ApatitiOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}