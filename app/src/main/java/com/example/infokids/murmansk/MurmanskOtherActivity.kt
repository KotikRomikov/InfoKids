package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.murmansk.other.MurmanskOtherHireActivity
import com.example.infokids.murmansk.other.MurmanskOtherNanniesPrivateKindergartensActivity

class MurmanskOtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
