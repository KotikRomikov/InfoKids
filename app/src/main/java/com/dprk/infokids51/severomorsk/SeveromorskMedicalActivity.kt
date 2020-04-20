package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.medical.*

class SeveromorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_medical)
    }

    fun doctors(view: View) {
        val severomorskMedicalDoctorsIntent = Intent(this,
            SeveromorskMedicalDoctorsActivity::class.java)
        startActivity(severomorskMedicalDoctorsIntent)
    }

    fun massage(view: View) {
        val severomorskMedicalMassageIntent = Intent(this,
            SeveromorskMedicalMassageActivity::class.java)
        startActivity(severomorskMedicalMassageIntent)
    }

    fun logoped(view: View) {
        val severomorskMedicalLogopedIntent = Intent(this,SeveromorskMedicalLogopedActivity::class.java)
        startActivity(severomorskMedicalLogopedIntent)
    }

    fun psihologi(view: View) {
        val severomorskMedicalPsihologiIntent = Intent(this,SeveromorskMedicalPsihologiActivity::class.java)
        startActivity(severomorskMedicalPsihologiIntent)
    }

    fun Hospital(view: View) {
        val severomorskMedicalHospitalIntent = Intent(this,SeveromorskMedicalHospitalActivity::class.java)
        startActivity(severomorskMedicalHospitalIntent)
    }
}
