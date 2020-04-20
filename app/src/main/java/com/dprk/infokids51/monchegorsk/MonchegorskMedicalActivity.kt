package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalHospitalActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalLogopedActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalMassageActivity
import com.dprk.infokids51.monchegorsk.medical.MonchegorskMedicalPsihologiActivity

class MonchegorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_medical)
    }

    fun Hospital(view: View) {
        val hospitalIntent = Intent(this,MonchegorskMedicalHospitalActivity::class.java)
        startActivity(hospitalIntent)
    }
    fun massage(view: View) {
        val massageIntent = Intent(this,MonchegorskMedicalMassageActivity::class.java)
        startActivity(massageIntent)
    }
    fun logoped(view: View) {
        val logopedIntent = Intent(this,MonchegorskMedicalLogopedActivity::class.java)
        startActivity(logopedIntent)
    }
    fun psihologi(view: View) {
        val psihologiIntent = Intent(this,MonchegorskMedicalPsihologiActivity::class.java)
        startActivity(psihologiIntent)
    }
}
