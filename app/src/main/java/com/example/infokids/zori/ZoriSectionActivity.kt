package com.example.infokids.zori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class ZoriSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zori_section)
    }

    fun MedicalSection(view: View) {}
    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {}
    fun ShopSection(view: View) {}
    fun RelaxationSection(view: View) {}
}
