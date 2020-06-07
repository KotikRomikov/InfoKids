package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.relaxation.*
import kotlinx.android.synthetic.main.activity_murmansk_relaxion.*

class MurmanskRelaxionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_relaxion)


         gamePlace.setOnClickListener {
            val gamePlaceIntent = Intent(this, MurmanskGamePlaceActivity::class.java)
            startActivity(gamePlaceIntent)
        }

         quest.setOnClickListener {
            val questIntent = Intent(this, MurmanskQuestActivity::class.java)
            startActivity(questIntent)
        }

         sport.setOnClickListener {
            val sportIntent = Intent(this, MurmanskSportActivity::class.java)
            startActivity(sportIntent)
        }

         antiKafe.setOnClickListener {
            val antiKafeIntent = Intent(this, MurmanskAntiCafeActivity::class.java)
            startActivity(antiKafeIntent)
        }

         intellectGame.setOnClickListener {
            val intellectGameIntent = Intent(this, MurmanskIntellectGameActivity::class.java)
            startActivity(intellectGameIntent)
        }

         kidsOrganization.setOnClickListener {
            val kidsOrganizationIntent = Intent(this, MurmanskKidsOrganizationActivity::class.java)
            startActivity(kidsOrganizationIntent)
        }

         zoo.setOnClickListener {
            val zooIntent = Intent(this, MurmanskZooActivity::class.java)
            startActivity(zooIntent)
        }

         culture.setOnClickListener {
            val cultureIntent = Intent(this, MurmanskCultureActivity::class.java)
            startActivity(cultureIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, MurmanskOtherRelaxationActivity::class.java)
            startActivity(otherIntent)
        }
    }
}