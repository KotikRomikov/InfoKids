package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.medical.ZoriMedicalHospitalActivity
import com.dprk.infokids51.zori.medical.ZoriMedicalMassageActivity
import com.dprk.infokids51.zori.medical.ZoriMedicalPsihologiActivity

class ZoriMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_medical)
    }

    fun massage(view: View) {
        val massage = Intent(this, ZoriMedicalMassageActivity::class.java)
        startActivity(massage)
    }
    fun psihologi(view: View) {
        val psihologiIntent = Intent(this,ZoriMedicalPsihologiActivity::class.java)
        startActivity(psihologiIntent)
    }
    fun hospital(view: View) {
        val hospitalIntent = Intent(this,ZoriMedicalHospitalActivity::class.java)
        startActivity(hospitalIntent)
    }
}
