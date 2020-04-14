package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.severomorsk.celebration.SeveromorskCelebrationAnimatorActivity
import com.example.infokids.severomorsk.celebration.SeveromorskCelebrationBallsActivity
import com.example.infokids.severomorsk.celebration.SeveromorskCelebrationCakesActivity
import com.example.infokids.severomorsk.celebration.SeveromorskCelebrationOtherActivity

class SeveromorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,SeveromorskCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,SeveromorskCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,SeveromorskCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)

    }    fun other(view: View) {
        val otherIntent = Intent(this,SeveromorskCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
