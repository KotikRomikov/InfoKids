package com.dprk.infokids51.zori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.celebration.ZoriCelebrationAnimatorActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationBallsActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationCakesActivity
import com.dprk.infokids51.zori.celebration.ZoriCelebrationOtherActivity

class ZoriCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zori_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,ZoriCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,ZoriCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,ZoriCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,ZoriCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
