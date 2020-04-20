package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationCafeActivity
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationOtherActivity
import com.dprk.infokids51.zori.relaxation.ZoriRelaxationSportActivity

class ZoriRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_relaxation)
    }

    fun sport(view: View) {
        val sportIntent = Intent(this,ZoriRelaxationSportActivity::class.java)
        startActivity(sportIntent)
    }
    fun cafe(view: View) {
        val cafeIntent = Intent(this,ZoriRelaxationCafeActivity::class.java)
        startActivity(cafeIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,ZoriRelaxationOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
