package com.dprk.infokids51.monchegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationAnimatorActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationBallsActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationCakesActivity
import com.dprk.infokids51.monchegorsk.celebration.MonchegorskCelebrationOtherActivity

class MonchegorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monchegorsk_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,MonchegorskCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,MonchegorskCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,MonchegorskCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,MonchegorskCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
