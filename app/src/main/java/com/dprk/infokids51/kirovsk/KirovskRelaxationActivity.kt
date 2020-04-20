package com.dprk.infokids51.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.relaxation.KirovskRelaxationGamePlaceActivity
import com.dprk.infokids51.kirovsk.relaxation.KirovskRelaxationSportActivity

class KirovskRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_relaxation)
    }

    fun gamePlace(view: View) {
        val gamePlaceIntent = Intent(this,KirovskRelaxationGamePlaceActivity::class.java)
        startActivity(gamePlaceIntent)
    }
    fun sport(view: View) {
        val sportIntent = Intent(this,KirovskRelaxationSportActivity::class.java)
        startActivity(sportIntent)
    }
}
