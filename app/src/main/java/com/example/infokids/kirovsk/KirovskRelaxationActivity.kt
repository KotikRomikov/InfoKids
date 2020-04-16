package com.example.infokids.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kirovsk.relaxation.KirovskRelaxationGamePlaceActivity
import com.example.infokids.kirovsk.relaxation.KirovskRelaxationSportActivity

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
