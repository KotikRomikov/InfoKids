package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationAnimatorActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationBallsActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationCakesActivity
import com.dprk.infokids51.olenegorsk.celebration.OlenegorskCelebrationOtherActivity

class OlenegorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,OlenegorskCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,OlenegorskCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,OlenegorskCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,OlenegorskCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
