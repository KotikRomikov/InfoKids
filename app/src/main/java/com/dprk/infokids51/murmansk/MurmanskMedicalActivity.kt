package com.dprk.infokids51.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.medical.*

class MurmanskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_medical)
    }

    fun pediatorMurmansk(view: View) {
        val pediatorMurmanskIntent = Intent(this,MurmanskPediatorActivity::class.java)
        startActivity(pediatorMurmanskIntent)
    }
    fun nevrologMurmansk(view: View) {
        val nevrologMurmanskIntent = Intent(this, MurmanskNevrologActivity::class.java)
        startActivity(nevrologMurmanskIntent)
    }
    fun massagMurmansk(view: View) {
        val massagMurmanskIntent = Intent(this,MurmanskMassagActivity::class.java)
        startActivity(massagMurmanskIntent)
    }
    fun logopediMurmansk(view: View) {
        val logopedMurmanskIntent = Intent(this,MurmanskLogopedActivity::class.java)
        startActivity(logopedMurmanskIntent)
    }
    fun psihologiMurmansk(view: View) {
        val psihologiMurmanskIntent = Intent(this,MurmanskPsihologiActivity::class.java)
        startActivity(psihologiMurmanskIntent)
    }
    fun grudnMurmansk(view: View) {
        val grudnMurmanskIntent = Intent(this,MurmanskGrudnActivity::class.java)
        startActivity(grudnMurmanskIntent)
    }
    fun hospitalMurmansk(view: View) {
        val hospitalMurmanskIntent = Intent(this,MurmanskHospitalActivity::class.java)
        startActivity(hospitalMurmanskIntent)
    }
    fun rodiHouseMurmansk(view: View) {
        val rodiMurmanskIntent = Intent(this,MurmanskRodiActivity::class.java)
        startActivity(rodiMurmanskIntent)
    }
    fun privateHospitalMurmansk(view: View) {
        val privateHospitalMurmanskIntent = Intent(this,MurmanskPrivateHospitalActivity::class.java)
        startActivity(privateHospitalMurmanskIntent)
    }
}
