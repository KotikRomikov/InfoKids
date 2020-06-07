package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_monchegorsk_section.*

class MonchegorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_section)


         OtherSection.setOnClickListener {
            val otherIntent = Intent(this, MonchegorskOtherActivity::class.java)
            startActivity(otherIntent)
        }

         FotoVideoSection.setOnClickListener {
            val FotoVideoSectionIntent = Intent(this, MonchegorskFotoVideoActivity::class.java)
            startActivity(FotoVideoSectionIntent)
        }

         CelebrationSection.setOnClickListener {
            val CelebrationSectionIntent = Intent(this, MonchegorskCelebrationActivity::class.java)
            startActivity(CelebrationSectionIntent)
        }

         HobbySection.setOnClickListener {
            val hobbyIntent = Intent(this, MonchegorskHobbyActivity::class.java)
            startActivity(hobbyIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxationIntent = Intent(this, MonchegorskRelaxationActivity::class.java)
            startActivity(relaxationIntent)
        }

         MedicalSection.setOnClickListener {
            val medicalIntent = Intent(this, MonchegorskMedicalActivity::class.java)
            startActivity(medicalIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, MonchegorskShopActivity::class.java)
            startActivity(shopIntent)
        }
    }
}