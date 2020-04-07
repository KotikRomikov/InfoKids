package com.example.infokids.kirovsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class KirovskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_section)
    }

    fun MedicalRazdel(view: View) {}
    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {}
    fun ShopSection(view: View) {}
    fun RelaxationSection(view: View) {}
    fun MedicalSection(view: View) {}
}
