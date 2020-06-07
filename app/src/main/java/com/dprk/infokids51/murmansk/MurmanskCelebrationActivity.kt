package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.celebration.MurmanskCelebrationAnimatorActivity
import com.dprk.infokids51.murmansk.celebration.MurmanskCelebrationBallsActivity
import com.dprk.infokids51.murmansk.celebration.MurmanskCelebrationCakesActivity
import com.dprk.infokids51.murmansk.celebration.MurmanskCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_murmansk_celebration.*

class MurmanskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_celebration)


         cakes.setOnClickListener {
            val cakesIntent = Intent(this, MurmanskCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, MurmanskCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, MurmanskCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

         other.setOnClickListener {
            val otherCelebrationIntent = Intent(this, MurmanskCelebrationOtherActivity::class.java)
            startActivity(otherCelebrationIntent)
        }
    }
}