package com.example.infokids.apatiti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class ApatitiSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_section)
    }

    fun MedicalSection(view: View) {}
    fun RelaxationSection(view: View) {}
    fun ShopSection(view: View) {}
    fun HobbySection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun barberSection(view: View) {}
    fun OtherSection(view: View) {}
}
