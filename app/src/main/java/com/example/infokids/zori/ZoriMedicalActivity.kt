package com.example.infokids.zori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.zori.medical.ZoriMedicalHospitalActivity
import com.example.infokids.zori.medical.ZoriMedicalMassageActivity
import com.example.infokids.zori.medical.ZoriMedicalPsihologiActivity

class ZoriMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
