package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.celebration.SeveromorskCelebrationAnimatorActivity
import com.dprk.infokids51.severomorsk.celebration.SeveromorskCelebrationBallsActivity
import com.dprk.infokids51.severomorsk.celebration.SeveromorskCelebrationCakesActivity
import com.dprk.infokids51.severomorsk.celebration.SeveromorskCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_severomorsk_celebration.*

class SeveromorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_celebration)


         cakes.setOnClickListener {
            val cakesIntent = Intent(this, SeveromorskCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, SeveromorskCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, SeveromorskCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)

        }

         other.setOnClickListener {
            val otherIntent = Intent(this, SeveromorskCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}