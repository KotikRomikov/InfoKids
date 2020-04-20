package com.dprk.infokids51.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class KirovskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_section)
    }

    fun OtherSection(view: View) {
        val otherIntent = Intent(this,KirovskOtherActivity::class.java)
        startActivity(otherIntent)
    }
    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,KirovskFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,KirovskCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
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
