package com.example.infokids.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kirovsk.celebration.KirovskCelebrationAnimatorActivity
import com.example.infokids.kirovsk.celebration.KirovskCelebrationBallsActivity
import com.example.infokids.kirovsk.celebration.KirovskCelebrationCakesActivity
import com.example.infokids.kirovsk.celebration.KirovskCelebrationOtherActivity

class KirovskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_celebration)
    }
    fun cakes(view: View) {
        val cakesIntent = Intent(this,KirovskCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }
    fun balls(view: View) {
        val ballsIntent = Intent(this,KirovskCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }
    fun animator(view: View) {
        val animatorIntent = Intent(this,KirovskCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)

    }    fun other(view: View) {
        val otherIntent = Intent(this,KirovskCelebrationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
