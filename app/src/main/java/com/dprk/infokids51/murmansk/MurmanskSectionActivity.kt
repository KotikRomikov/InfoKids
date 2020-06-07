package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_murmansk_section.*

class MurmanskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_section)


         MedicalSection.setOnClickListener {
            val murmanskMedicalIntent = Intent(this, MurmanskMedicalActivity::class.java)
            startActivity(murmanskMedicalIntent)
        }

         OtherSection.setOnClickListener {
            val otherIntent = Intent(this, MurmanskOtherActivity::class.java)
            startActivity(otherIntent)
        }

         FotoVideoSection.setOnClickListener {
            val fotoVideoIntent = Intent(this, MurmanskFotoVideoActivity::class.java)
            startActivity(fotoVideoIntent)
        }

         CelebrationSection.setOnClickListener {
            val celebrationIntent = Intent(this, MurmanskCelebrationActivity::class.java)
            startActivity(celebrationIntent)
        }

         HobbySection.setOnClickListener {
            val hobbyIntent = Intent(this, MurmanskHobbyActivity::class.java)
            startActivity(hobbyIntent)
        }

         ShopSection.setOnClickListener {
            val shopIntent = Intent(this, MurmanskShopActivity::class.java)
            startActivity(shopIntent)
        }

         RelaxationSection.setOnClickListener {
            val relaxionIntent = Intent(this, MurmanskRelaxionActivity::class.java)
            startActivity(relaxionIntent)
        }
    }
}