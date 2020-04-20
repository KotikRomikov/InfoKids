package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationAnimatorActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationBallsActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationCakesActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationOtherActivity

class KandalakshaCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,KandalakshaCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,KandalakshaCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,KandalakshaCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,KandalakshaCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
