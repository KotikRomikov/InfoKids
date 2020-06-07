package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationAnimatorActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationBallsActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationCakesActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_monchegorsk_celebration.*

class MonchegorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_celebration)


         cakes.setOnClickListener {
            val cakesIntent = Intent(this, MonchegorskCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, MonchegorskCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, MonchegorskCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, MonchegorskCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}