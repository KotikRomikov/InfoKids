package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalHospitalActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalLogopedActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalMassageActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalPsihologiActivity
import kotlinx.android.synthetic.main.activity_monchegorsk_medical.*

class MonchegorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_medical)


         Hospital.setOnClickListener {
            val hospitalIntent = Intent(this, MonchegorskMedicalHospitalActivity::class.java)
            startActivity(hospitalIntent)
        }

         massage.setOnClickListener {
            val massageIntent = Intent(this, MonchegorskMedicalMassageActivity::class.java)
            startActivity(massageIntent)
        }

         logoped.setOnClickListener {
            val logopedIntent = Intent(this, MonchegorskMedicalLogopedActivity::class.java)
            startActivity(logopedIntent)
        }

         psihologi.setOnClickListener {
            val psihologiIntent = Intent(this, MonchegorskMedicalPsihologiActivity::class.java)
            startActivity(psihologiIntent)
        }
    }
}