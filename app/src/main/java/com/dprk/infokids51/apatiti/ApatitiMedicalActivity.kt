package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.medical.*

class ApatitiMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
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
