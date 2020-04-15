package com.example.infokids.monchegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.monchegorsk.medical.MonchegorskMedicalHospitalActivity
import com.example.infokids.monchegorsk.medical.MonchegorskMedicalLogopedActivity
import com.example.infokids.monchegorsk.medical.MonchegorskMedicalMassageActivity
import com.example.infokids.monchegorsk.medical.MonchegorskMedicalPsihologiActivity

class MonchegorskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
