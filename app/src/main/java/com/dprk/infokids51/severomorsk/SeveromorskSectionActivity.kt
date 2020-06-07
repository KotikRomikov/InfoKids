package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_severomorsk_section.*

class SeveromorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_section)


         OtherSection.setOnClickListener {
            val otherIntent = Intent(this, SeveromorskOtherActivity::class.java)
            startActivity(otherIntent)
        }

         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, SeveromorskFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, SeveromorskCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         HobbySection.setOnClickListener {
            val severomorskHobbyIntent = Intent(this, SeveromorskHobbyActivity::class.java)
            startActivity(severomorskHobbyIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, SeveromorskShopActivity::class.java)
            startActivity(shopIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxtionIntent = Intent(this, SeveromorskRelaxtionActivity::class.java)
            startActivity(relaxtionIntent)
        }

         MedicalSection.setOnClickListener {
            val severomorskMedicalIntent = Intent(this, SeveromorskMedicalActivity::class.java)
            startActivity(severomorskMedicalIntent)
        }
    }
}