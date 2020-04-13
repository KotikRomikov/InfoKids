package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.severomorsk.relaxtion.SeveromorskRelaxtionGamePlaceActivity
import com.example.infokids.severomorsk.relaxtion.SeveromorskRelaxtionKidsOrganizationActivity
import com.example.infokids.severomorsk.relaxtion.SeveromorskRelaxtionSportActivity

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
