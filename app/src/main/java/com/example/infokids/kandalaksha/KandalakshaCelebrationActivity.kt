package com.example.infokids.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kandalaksha.celebration.KandalakshaCelebrationAnimatorActivity
import com.example.infokids.kandalaksha.celebration.KandalakshaCelebrationBallsActivity
import com.example.infokids.kandalaksha.celebration.KandalakshaCelebrationCakesActivity
import com.example.infokids.kandalaksha.celebration.KandalakshaCelebrationOtherActivity

class KandalakshaCelebrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
