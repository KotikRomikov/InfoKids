package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.medical.*
import kotlinx.android.synthetic.main.activity_apatiti_medical.*

class ApatitiMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_medical)


        doctor.setOnClickListener {
            val doctorIntent = Intent(this, ApatitiMedicalDoctorActivity::class.java)
            startActivity(doctorIntent)
        }

        massage.setOnClickListener {
            val massageIntent = Intent(this, ApatitiMedicalMassageActivity::class.java)
            startActivity(massageIntent)
        }

        logoped.setOnClickListener {
            val logopedIntent = Intent(this, ApatitiMedicalLogopedActivity::class.java)
            startActivity(logopedIntent)
        }

        psihologi.setOnClickListener {
            val psihologiIntent = Intent(this, ApatitiMedicalPsihologiActivity::class.java)
            startActivity(psihologiIntent)
        }

        sanative.setOnClickListener {
            val sanativeIntent = Intent(this, ApatitiMedicalSanativeActivity::class.java)
            startActivity(sanativeIntent)
        }

        privateHospital.setOnClickListener {
            val privateHospitalIntent =
                Intent(this, ApatitiMedicalPrivateHospitalActivity::class.java)
            startActivity(privateHospitalIntent)
        }

        hospital.setOnClickListener {
            val hospitalIntent = Intent(this, ApatitiMedicalHospitalActivity::class.java)
            startActivity(hospitalIntent)
        }
    }
}