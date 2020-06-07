package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationAnimatorActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationBallsActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationCakesActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_olenegorsk_celebration.*

class OlenegorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_celebration)


         cakes.setOnClickListener {
            val cakesIntent = Intent(this, OlenegorskCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, OlenegorskCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, OlenegorskCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, OlenegorskCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}