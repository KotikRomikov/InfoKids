package com.example.infokids.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class KirovskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_section)
    }

    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {
        val hobbyIntent = Intent(this,KirovskHobbyActivity::class.java)
        startActivity(hobbyIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,KirovskShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxationIntent = Intent(this,KirovskRelaxationActivity::class.java)
        startActivity(relaxationIntent)
    }
    fun MedicalSection(view: View) {
        val medicalIntent = Intent(this,KirovskMedicalActivity::class.java)
        startActivity(medicalIntent)
    }
}
