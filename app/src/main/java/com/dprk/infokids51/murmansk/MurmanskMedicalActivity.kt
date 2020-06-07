package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.medical.*
import kotlinx.android.synthetic.main.activity_murmansk_medical.*

class MurmanskMedicalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_medical)


         pediatorMurmansk.setOnClickListener {
            val pediatorMurmanskIntent = Intent(this, MurmanskPediatorActivity::class.java)
            startActivity(pediatorMurmanskIntent)
        }

         nevrologMurmansk.setOnClickListener {
            val nevrologMurmanskIntent = Intent(this, MurmanskNevrologActivity::class.java)
            startActivity(nevrologMurmanskIntent)
        }

         massagMurmansk.setOnClickListener {
            val massagMurmanskIntent = Intent(this, MurmanskMassagActivity::class.java)
            startActivity(massagMurmanskIntent)
        }

         logopediMurmansk.setOnClickListener {
            val logopedMurmanskIntent = Intent(this, MurmanskLogopedActivity::class.java)
            startActivity(logopedMurmanskIntent)
        }

         psihologiMurmansk.setOnClickListener {
            val psihologiMurmanskIntent = Intent(this, MurmanskPsihologiActivity::class.java)
            startActivity(psihologiMurmanskIntent)
        }

         grudnMurmansk.setOnClickListener {
            val grudnMurmanskIntent = Intent(this, MurmanskGrudnActivity::class.java)
            startActivity(grudnMurmanskIntent)
        }

         hospitalMurmansk.setOnClickListener {
            val hospitalMurmanskIntent = Intent(this, MurmanskHospitalActivity::class.java)
            startActivity(hospitalMurmanskIntent)
        }

         rodiHouseMurmansk.setOnClickListener {
            val rodiMurmanskIntent = Intent(this, MurmanskRodiActivity::class.java)
            startActivity(rodiMurmanskIntent)
        }

         privateHospitalMurmansk.setOnClickListener {
            val privateHospitalMurmanskIntent =
                Intent(this, MurmanskPrivateHospitalActivity::class.java)
            startActivity(privateHospitalMurmanskIntent)
        }
    }
}