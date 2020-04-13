package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.severomorsk.medical.*

class SeveromorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
