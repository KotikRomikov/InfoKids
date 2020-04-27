package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationAnimatorActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationBallsActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationCakesActivity
import com.dprk.infokids51.apatiti.celebration.ApatitiCelebrationOtherActivity

class ApatitiCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this, ApatitiCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }

    fun balls(view: View) {
        val ballsIntent = Intent(this, ApatitiCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }

    fun animator(view: View) {
        val animatorIntent = Intent(this,ApatitiCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }

    fun other(view: View) {
        val otherCelebrationIntent = Intent(this, ApatitiCelebrationOtherActivity::class.java)
        startActivity(otherCelebrationIntent)
    }
}
