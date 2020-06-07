package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.medical.ZoriMedicalHospitalActivity
import com.dprk.infokids51.zori.medical.ZoriMedicalMassageActivity
import com.dprk.infokids51.zori.medical.ZoriMedicalPsihologiActivity
import kotlinx.android.synthetic.main.activity_zori_medical.*

class ZoriMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_medical)


         massage.setOnClickListener {
            val massage = Intent(this, ZoriMedicalMassageActivity::class.java)
            startActivity(massage)
        }

         psihologi.setOnClickListener {
            val psihologiIntent = Intent(this, ZoriMedicalPsihologiActivity::class.java)
            startActivity(psihologiIntent)
        }

         hospital.setOnClickListener {
            val hospitalIntent = Intent(this, ZoriMedicalHospitalActivity::class.java)
            startActivity(hospitalIntent)
        }
    }
}