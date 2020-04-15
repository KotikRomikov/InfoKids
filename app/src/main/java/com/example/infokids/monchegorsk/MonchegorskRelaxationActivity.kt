package com.example.infokids.monchegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.monchegorsk.relaxation.MonchegorskRelaxationCafeActivity
import com.example.infokids.monchegorsk.relaxation.MonchegorskRelaxationGamePlaceActivity
import com.example.infokids.monchegorsk.relaxation.MonchegorskRelaxationOtherActivity
import com.example.infokids.monchegorsk.relaxation.MonchegorskRelaxationSportActivity

class MonchegorskRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
