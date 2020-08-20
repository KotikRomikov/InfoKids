package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationAnimatorActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationBallsActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationCakesActivity
import com.dprk.infokids51.kandalaksha.celebration.KandalakshaCelebrationOtherActivity
import kotlinx.android.synthetic.main.activity_kandalaksha_celebration.*

class KandalakshaCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_celebration)

         cakes.setOnClickListener {
            val cakesIntent = Intent(this, KandalakshaCelebrationCakesActivity::class.java)
            startActivity(cakesIntent)
        }

         balls.setOnClickListener {
            val ballsIntent = Intent(this, KandalakshaCelebrationBallsActivity::class.java)
            startActivity(ballsIntent)
        }

         animator.setOnClickListener {
            val animatorIntent = Intent(this, KandalakshaCelebrationAnimatorActivity::class.java)
            startActivity(animatorIntent)
        }

         other.setOnClickListener {
            val otherIntent = Intent(this, KandalakshaCelebrationOtherActivity::class.java)
            startActivity(otherIntent)
        }
    }
}