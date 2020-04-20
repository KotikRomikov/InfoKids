package com.dprk.infokids51.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionGamePlaceActivity
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionKidsOrganizationActivity
import com.dprk.infokids51.severomorsk.relaxtion.SeveromorskRelaxtionSportActivity

class SeveromorskRelaxtionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_relaxtion)
    }

    fun game_place(view: View) {
        val gamePlaceIntent = Intent(this,SeveromorskRelaxtionGamePlaceActivity::class.java)
        startActivity(gamePlaceIntent)
    }

    fun sport_relaxion(view: View) {
        val sportIntent = Intent(this,SeveromorskRelaxtionSportActivity::class.java)
        startActivity(sportIntent)
    }

    fun kids_organization(view: View) {
        val kidsOrganizationIntent = Intent(this,SeveromorskRelaxtionKidsOrganizationActivity::class.java)
        startActivity(kidsOrganizationIntent)
    }
}
