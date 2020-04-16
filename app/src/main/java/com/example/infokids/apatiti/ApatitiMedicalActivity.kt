package com.example.infokids.apatiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.apatiti.medical.*

class ApatitiMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_medical)
    }

    fun doctor(view: View) {
        val doctorIntent = Intent(this,ApatitiMedicalDoctorActivity::class.java)
        startActivity(doctorIntent)
    }
    fun massage(view: View) {
        val massageIntent = Intent(this,ApatitiMedicalMassageActivity::class.java)
        startActivity(massageIntent)
    }
    fun logoped(view: View) {
        val logopedIntent = Intent(this,ApatitiMedicalLogopedActivity::class.java)
        startActivity(logopedIntent)
    }
    fun psihologi(view: View) {
        val psihologiIntent = Intent(this,ApatitiMedicalPsihologiActivity::class.java)
        startActivity(psihologiIntent)
    }
    fun sanative(view: View) {
        val sanativeIntent = Intent(this,ApatitiMedicalSanativeActivity::class.java)
        startActivity(sanativeIntent)
    }
    fun privateHospital(view: View) {
        val privateHospitalIntent = Intent(this,ApatitiMedicalPrivateHospitalActivity::class.java)
        startActivity(privateHospitalIntent)
    }
    fun hospital(view: View) {
        val hospitalIntent = Intent(this,ApatitiMedicalHospitalActivity::class.java)
        startActivity(hospitalIntent)
    }
}
