package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalDoctorsActivity
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalHospitalActivity
import com.dprk.infokids51.kandalaksha.medical.KandalakshaMedicalMassageActivity

class KandalakshaMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
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
