package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.murmansk.medical.*

class MurmanskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_medical)
    }

    fun pediatorMurmansk(view: View) {
        val pediatorMurmanskIntent = Intent(this,PediatorMurmanskActivity::class.java)
        startActivity(pediatorMurmanskIntent)
    }
    fun nevrologMurmansk(view: View) {
        val nevrologMurmanskIntent = Intent(this, NevrologMurmanskActivity::class.java)
        startActivity(nevrologMurmanskIntent)
    }
    fun massagMurmansk(view: View) {
        val massagMurmanskIntent = Intent(this,MassagMurmanskActivity::class.java)
        startActivity(massagMurmanskIntent)
    }
    fun logopediMurmansk(view: View) {
        val logopedMurmanskIntent = Intent(this,LogopedMurmanskActivity::class.java)
        startActivity(logopedMurmanskIntent)
    }
    fun psihologiMurmansk(view: View) {
        val psihologiMurmanskIntent = Intent(this,PsihologiMurmanskActivity::class.java)
        startActivity(psihologiMurmanskIntent)
    }
    fun grudnMurmansk(view: View) {
        val grudnMurmanskIntent = Intent(this,GrudnMurmanskActivity::class.java)
        startActivity(grudnMurmanskIntent)
    }
    fun hospitalMurmansk(view: View) {
        val hospitalMurmanskIntent = Intent(this,HospitalMurmanskActivity::class.java)
        startActivity(hospitalMurmanskIntent)
    }
    fun rodiHouseMurmansk(view: View) {
        val rodiMurmanskIntent = Intent(this,RodiMurmanskActivity::class.java)
        startActivity(rodiMurmanskIntent)
    }
    fun privateHospitalMurmansk(view: View) {
        val privateHospitalMurmanskIntent = Intent(this,PrivateHospitalMurmanskActivity::class.java)
        startActivity(privateHospitalMurmanskIntent)
    }
}
