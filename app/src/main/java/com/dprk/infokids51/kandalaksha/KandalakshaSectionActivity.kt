package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_kandalaksha_section.*

class KandalakshaSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_section)


         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, KandalakshaFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, KandalakshaCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         HobbySection.setOnClickListener {
            val HobbySectionIntent = Intent(this, KandalakshaHobbyActivity::class.java)
            startActivity(HobbySectionIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, KandalakshaShopActivity::class.java)
            startActivity(shopIntent)
        }

         RelaxationSection.setOnClickListener {
            val RelaxationSectionIntent = Intent(this, KandalakshaRelaxationActivity::class.java)
            startActivity(RelaxationSectionIntent)
        }

         MedicalSection.setOnClickListener {
            val MedicalSectionIntent = Intent(this, KandalakshaMedicalActivity::class.java)
            startActivity(MedicalSectionIntent)
        }
    }
}