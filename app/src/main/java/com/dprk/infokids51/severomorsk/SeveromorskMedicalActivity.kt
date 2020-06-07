package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.medical.*
import kotlinx.android.synthetic.main.activity_severomorsk_medical.*

class SeveromorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_medical)


         doctors.setOnClickListener {
            val severomorskMedicalDoctorsIntent = Intent(
                this,
                SeveromorskMedicalDoctorsActivity::class.java
            )
            startActivity(severomorskMedicalDoctorsIntent)
        }

         massage.setOnClickListener {
            val severomorskMedicalMassageIntent = Intent(
                this,
                SeveromorskMedicalMassageActivity::class.java
            )
            startActivity(severomorskMedicalMassageIntent)
        }

         logoped.setOnClickListener {
            val severomorskMedicalLogopedIntent =
                Intent(this, SeveromorskMedicalLogopedActivity::class.java)
            startActivity(severomorskMedicalLogopedIntent)
        }

         psihologi.setOnClickListener {
            val severomorskMedicalPsihologiIntent =
                Intent(this, SeveromorskMedicalPsihologiActivity::class.java)
            startActivity(severomorskMedicalPsihologiIntent)
        }

         Hospital.setOnClickListener {
            val severomorskMedicalHospitalIntent =
                Intent(this, SeveromorskMedicalHospitalActivity::class.java)
            startActivity(severomorskMedicalHospitalIntent)
        }
    }
}