package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.murmansk.celebration.MurmanskCelebrationAnimatorActivity
import com.example.infokids.murmansk.celebration.MurmanskCelebrationBallsActivity
import com.example.infokids.murmansk.celebration.MurmanskCelebrationCakesActivity
import com.example.infokids.murmansk.celebration.MurmanskCelebrationOtherActivity

class MurmanskCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_celebration)
    }

    fun cakes(view: View) {
        val cakesIntent = Intent(this,MurmanskCelebrationCakesActivity::class.java)
        startActivity(cakesIntent)
    }

    fun balls(view: View) {
        val ballsIntent = Intent(this,MurmanskCelebrationBallsActivity::class.java)
        startActivity(ballsIntent)
    }

    fun animator(view: View) {
        val animatorIntent = Intent(this,MurmanskCelebrationAnimatorActivity::class.java)
        startActivity(animatorIntent)
    }

    fun other(view: View) {
        val otherCelebrationIntent = Intent(this,MurmanskCelebrationOtherActivity::class.java)
        startActivity(otherCelebrationIntent)
    }
}
