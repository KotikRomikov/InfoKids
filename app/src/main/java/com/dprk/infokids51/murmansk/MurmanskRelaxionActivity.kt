package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.relaxation.MurmanskKidsOrganizationActivity
import com.dprk.infokids51.murmansk.relaxation.MurmanskZooActivity
import kotlinx.android.synthetic.main.activity_murmansk_relaxion.*

class MurmanskRelaxionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_relaxion)




         kidsOrganization.setOnClickListener {
            val kidsOrganizationIntent = Intent(this, MurmanskKidsOrganizationActivity::class.java)
            startActivity(kidsOrganizationIntent)
        }

         zoo.setOnClickListener {
            val zooIntent = Intent(this, MurmanskZooActivity::class.java)
            startActivity(zooIntent)
        }


    }
}