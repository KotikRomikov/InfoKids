package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationAnimatorActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationBallsActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationCakesActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_apatiti_celebration.*

class ApatitiCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_celebration)




        cakes.setOnClickListener {
            val cakesIntent = Intent(this, ApatitiCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

        balls.setOnClickListener {
            val ballsIntent = Intent(this, ApatitiCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

        animator.setOnClickListener {
            val animatorIntent = Intent(this, ApatitiCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

        other.setOnClickListener {
            val otherCelebrationIntent = Intent(this, ApatitiCelebrationOtherActivity::class.java)
            startActivity(otherCelebrationIntent)
        }
    }
}