package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalDoctorsActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalHospitalActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalLogopedActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalMassageActivity
import kotlinx.android.synthetic.main.activity_kirovsk_medical.*

class KirovskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_medical)


         doctors.setOnClickListener {
            val doctorsIntent = Intent(this, KirovskMedicalDoctorsActivity::class.java)
            startActivity(doctorsIntent)
        }

         massage.setOnClickListener {
            val massageIntent = Intent(this, KirovskMedicalMassageActivity::class.java)
            startActivity(massageIntent)
        }

         logoped.setOnClickListener {
            val logopedIntent = Intent(this, KirovskMedicalLogopedActivity::class.java)
            startActivity(logopedIntent)
        }

         hospital.setOnClickListener {
            val hospitalIntent = Intent(this, KirovskMedicalHospitalActivity::class.java)
            startActivity(hospitalIntent)
        }
    }
}