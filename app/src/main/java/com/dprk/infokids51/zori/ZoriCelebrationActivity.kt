package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.celebration.ZoriCelebrationAnimatorActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationBallsActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationCakesActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_zori_celebration.*

class ZoriCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_celebration)


         cakes.setOnClickListener {
            val cakesIntent = Intent(this, ZoriCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, ZoriCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, ZoriCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, ZoriCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}