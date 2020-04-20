package com.dprk.infokids51.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.other.SeveromorskOtherHireActivity
import com.dprk.infokids51.severomorsk.other.SeveromorskOtherNanniesPrivateKindergartensActivity

class SeveromorskOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_other)
    }

    fun hire(view: View) {
        val hireIntent = Intent(this,SeveromorskOtherHireActivity::class.java)
        startActivity(hireIntent)
    }
    fun nannies(view: View) {
        val nanniesIntent = Intent(this,SeveromorskOtherNanniesPrivateKindergartensActivity::class.java)
        startActivity(nanniesIntent)
    }
}
