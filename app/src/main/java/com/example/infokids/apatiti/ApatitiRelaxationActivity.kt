package com.example.infokids.apatiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.apatiti.relaxation.ApatitiRelaxationCafeActivity
import com.example.infokids.apatiti.relaxation.ApatitiRelaxationGameCentreActivity
import com.example.infokids.apatiti.relaxation.ApatitiRelaxationKidsOrganizationActivity
import com.example.infokids.apatiti.relaxation.ApatitiRelaxationSportActivity

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
