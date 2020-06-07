package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalDoctorsActivity
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalHospitalActivity
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalMassageActivity
import kotlinx.android.synthetic.main.activity_kandalaksha_medical.*

class KandalakshaMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_medical)


         hospital.setOnClickListener {
            val hospitalIntent = Intent(this, KandalakshaMedicalHospitalActivity::class.java)
            startActivity(hospitalIntent)
        }

         doctors.setOnClickListener {
            val doctorsIntent = Intent(this, KandalakshaMedicalDoctorsActivity::class.java)
            startActivity(doctorsIntent)
        }

         massage.setOnClickListener {
            val massageIntent = Intent(this, KandalakshaMedicalMassageActivity::class.java)
            startActivity(massageIntent)
        }
    }
}