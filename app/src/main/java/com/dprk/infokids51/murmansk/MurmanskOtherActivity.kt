package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.other.MurmanskOtherHireActivity
import com.dprk.infokids51.murmansk.other.MurmanskOtherNanniesPrivateKindergartensActivity
import kotlinx.android.synthetic.main.activity_murmansk_other.*

class MurmanskOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_other)


         hire.setOnClickListener {
            val MurmanskOtherHireIntent = Intent(this, MurmanskOtherHireActivity::class.java)
            startActivity(MurmanskOtherHireIntent)
        }

         nanniesPrivateKindergartens.setOnClickListener {
            val MurmanskOtherNanniesPrivateKindergartensIntent =
                Intent(this, MurmanskOtherNanniesPrivateKindergartensActivity::class.java)
            startActivity(MurmanskOtherNanniesPrivateKindergartensIntent)
        }
    }
}