package com.example.infokids.apatiti

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.infokids.R
import com.example.infokids.apatiti.ApatitiCelebrationActivity

class ApatitiSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_section)
    }

    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this, ApatitiCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }

    fun MedicalSection(view: View) {}
    fun RelaxationSection(view: View) {}
    fun ShopSection(view: View) {}
    fun HobbySection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun barberSection(view: View) {}
    fun OtherSection(view: View) {}
}
