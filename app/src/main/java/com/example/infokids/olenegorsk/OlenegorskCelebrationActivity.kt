package com.example.infokids.olenegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.olenegorsk.celebration.OlenegorskCelebrationAnimatorActivity
import com.example.infokids.olenegorsk.celebration.OlenegorskCelebrationBallsActivity
import com.example.infokids.olenegorsk.celebration.OlenegorskCelebrationCakesActivity
import com.example.infokids.olenegorsk.celebration.OlenegorskCelebrationOtherActivity

class OlenegorskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
