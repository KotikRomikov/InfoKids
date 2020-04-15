package com.example.infokids.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kandalaksha.medical.KandalakshaMedicalDoctorsActivity
import com.example.infokids.kandalaksha.medical.KandalakshaMedicalHospitalActivity
import com.example.infokids.kandalaksha.medical.KandalakshaMedicalMassageActivity

class KandalakshaMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kandalaksha_medical)
    }

    fun hospital(view: View) {
        val hospitalIntent = Intent(this,KandalakshaMedicalHospitalActivity::class.java)
        startActivity(hospitalIntent)
    }
    fun doctors(view: View) {
        val doctorsIntent = Intent(this,KandalakshaMedicalDoctorsActivity::class.java)
        startActivity(doctorsIntent)
    }
    fun massage(view: View) {
        val massageIntent = Intent(this,KandalakshaMedicalMassageActivity::class.java)
        startActivity(massageIntent)
    }
}
