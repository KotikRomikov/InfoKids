package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationCafeActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationGamePlaceActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationOtherActivity
import com.dprk.infokids51.monchegorsk.relaxation.MonchegorskRelaxationSportActivity

class MonchegorskRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_relaxation)
    }

    fun sport_relaxion(view: View) {
        val sportIntent = Intent(this,MonchegorskRelaxationSportActivity::class.java)
        startActivity(sportIntent)
    }
    fun game_place(view: View) {
        val gamePlaceIntent = Intent(this,MonchegorskRelaxationGamePlaceActivity::class.java)
        startActivity(gamePlaceIntent)
    }
    fun relaxation_cafe(view: View) {
        val cafeIntent = Intent(this,MonchegorskRelaxationCafeActivity::class.java)
        startActivity(cafeIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,MonchegorskRelaxationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
