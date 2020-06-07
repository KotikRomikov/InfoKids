package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import kotlinx.android.synthetic.main.activity_zori_section.*

class ZoriSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_section)


     MedicalSection.setOnClickListener {
        val MedicalSectionIntent = Intent(this,ZoriMedicalActivity::class.java)
        startActivity(MedicalSectionIntent)
    }
     OtherSection.setOnClickListener {
        val otherIntent = Intent(this,ZoriOtherActivity::class.java)
        startActivity(otherIntent)
    }
     FotoVideoSection.setOnClickListener {
        val fotoVideoIntent = Intent(this,ZoriFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
     CelebrationSection.setOnClickListener {
        val celebrationIntent = Intent(this,ZoriCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
     HobbySection.setOnClickListener {
        val HobbySectionIntent = Intent(this,ZoriHobbyActivity::class.java)
        startActivity(HobbySectionIntent)
    }
     ShopSection.setOnClickListener {
        val ShopSectionIntent = Intent(this,ZoriShopActivity::class.java)
        startActivity(ShopSectionIntent)
    }
     RelaxationSection.setOnClickListener {
        val RelaxationSectionIntent = Intent(this,ZoriRelaxationActivity::class.java)
        startActivity(RelaxationSectionIntent)
    }
}
}