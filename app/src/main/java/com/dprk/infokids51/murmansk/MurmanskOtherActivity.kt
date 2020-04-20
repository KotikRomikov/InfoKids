package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.other.MurmanskOtherHireActivity
import com.dprk.infokids51.murmansk.other.MurmanskOtherNanniesPrivateKindergartensActivity

class MurmanskOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_other)
    }

    fun hire(view: View) {
        val MurmanskOtherHireIntent = Intent(this,MurmanskOtherHireActivity::class.java)
        startActivity(MurmanskOtherHireIntent)
    }
    fun nanniesPrivateKindergartens(view: View) {
        val MurmanskOtherNanniesPrivateKindergartensIntent = Intent(this,MurmanskOtherNanniesPrivateKindergartensActivity::class.java)
        startActivity(MurmanskOtherNanniesPrivateKindergartensIntent)
    }
}
