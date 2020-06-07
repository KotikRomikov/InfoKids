package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.celebration.KirovskCelebrationAnimatorActivity
import com.dprk.infokids51.kirovsk.celebration.KirovskCelebrationBallsActivity
import com.dprk.infokids51.kirovsk.celebration.KirovskCelebrationCakesActivity
import com.dprk.infokids51.kirovsk.celebration.KirovskCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_kirovsk_celebration.*

class KirovskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_celebration)

         cakes.setOnClickListener {
            val cakesIntent = Intent(this, KirovskCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, KirovskCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, KirovskCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)

        }

         other.setOnClickListener {
            val otherIntent = Intent(this, KirovskCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}