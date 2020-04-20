package com.dprk.infokids51.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.relaxation.*

class KandalakshaRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kandalaksha_relaxation)
    }

    fun sport(view: View) {
        val sportIntent = Intent(this,KandalakshaRelaxationSportActivity::class.java)
        startActivity(sportIntent)
    }
    fun cafe(view: View) {
        val cafeIntent = Intent(this,KandalakshaRelaxationCafeActivity::class.java)
        startActivity(cafeIntent)
    }
    fun kids_organization(view: View) {
        val kids_organizationIntent = Intent(this,KandalakshaRelaxationKidsOrganizationActivity::class.java)
        startActivity(kids_organizationIntent)
    }
    fun game_place(view: View) {
        val game_placeIntent = Intent(this,KandalakshaRelaxationGamePlaceActivity::class.java)
        startActivity(game_placeIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,KandalakshaRelaxationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
