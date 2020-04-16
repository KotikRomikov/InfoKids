package com.example.infokids.zori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.zori.relaxation.ZoriRelaxationCafeActivity
import com.example.infokids.zori.relaxation.ZoriRelaxationOtherActivity
import com.example.infokids.zori.relaxation.ZoriRelaxationSportActivity

class ZoriRelaxationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
