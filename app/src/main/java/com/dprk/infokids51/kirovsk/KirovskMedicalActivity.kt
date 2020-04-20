package com.dprk.infokids51.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalDoctorsActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalHospitalActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalLogopedActivity
import com.dprk.infokids51.kirovsk.medical.KirovskMedicalMassageActivity

class KirovskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_medical)
    }

    fun doctors(view: View) {
        val doctorsIntent = Intent(this,KirovskMedicalDoctorsActivity::class.java)
        startActivity(doctorsIntent)
    }
    fun massage(view: View) {
        val massageIntent = Intent(this,KirovskMedicalMassageActivity::class.java)
        startActivity(massageIntent)
    }
    fun logoped(view: View) {
        val logopedIntent = Intent(this,KirovskMedicalLogopedActivity::class.java)
        startActivity(logopedIntent)
    }
    fun hospital(view: View) {
        val hospitalIntent = Intent(this,KirovskMedicalHospitalActivity::class.java)
        startActivity(hospitalIntent)
    }
}
