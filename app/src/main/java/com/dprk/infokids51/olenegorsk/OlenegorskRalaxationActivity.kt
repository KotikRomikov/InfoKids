package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationCafeActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationGamePlaceActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationKidsOrganizationActivity
import com.dprk.infokids51.olenegorsk.relaxtion.OlenegorskRelaxationOtherActivity

class OlenegorskRalaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_ralaxation)
    }

    fun game_place(view: View) {
        val gamePlaceIntent = Intent(this,OlenegorskRelaxationGamePlaceActivity::class.java)
        startActivity(gamePlaceIntent)
    }
    fun cafe(view: View) {
        val cafeIntent = Intent(this,OlenegorskRelaxationCafeActivity::class.java)
        startActivity(cafeIntent)
    }
    fun kids_organization(view: View) {
        val kidsOrganizationIntent = Intent(this,OlenegorskRelaxationKidsOrganizationActivity::class.java)
        startActivity(kidsOrganizationIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,OlenegorskRelaxationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
