package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.severomorsk.other.SeveromorskOtherHireActivity
import com.example.infokids.severomorsk.other.SeveromorskOtherNanniesPrivateKindergartensActivity

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
