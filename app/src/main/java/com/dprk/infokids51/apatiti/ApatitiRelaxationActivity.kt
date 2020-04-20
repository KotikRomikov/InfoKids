package com.dprk.infokids51.apatiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationCafeActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationGameCentreActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationKidsOrganizationActivity
import com.dprk.infokids51.apatiti.relaxation.ApatitiRelaxationSportActivity

class ApatitiRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_relaxation)
    }

    fun gameCentre(view: View) {
        val gameCentreIntent = Intent(this,ApatitiRelaxationGameCentreActivity::class.java)
        startActivity(gameCentreIntent)
    }
    fun sport(view: View) {
        val sportIntent = Intent(this,ApatitiRelaxationSportActivity::class.java)
        startActivity(sportIntent)
    }
    fun cafe(view: View) {
        val cafeIntent = Intent(this,ApatitiRelaxationCafeActivity::class.java)
        startActivity(cafeIntent)
    }
    fun kidsOrganization(view: View) {
        val kidsOrganizationIntent = Intent(this,ApatitiRelaxationKidsOrganizationActivity::class.java)
        startActivity(kidsOrganizationIntent)
    }
}
