package com.dprk.infokids51.apatiti

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R

class ApatitiSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apatiti_section)
    }

    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this, ApatitiCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }

    fun MedicalSection(view: View) {
        val medicalIntent = Intent(this,ApatitiMedicalActivity::class.java)
        startActivity(medicalIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxationIntent = Intent(this,ApatitiRelaxationActivity::class.java)
        startActivity(relaxationIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,ApatitiShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun HobbySection(view: View) {
        val HobbySectionIntent = Intent(this,ApatitiHobbyActivity::class.java)
        startActivity(HobbySectionIntent)
    }
    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,ApatitiFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun OtherSection(view: View) {
        val otherIntent = Intent(this,ApatitiOtherActivity::class.java)
        startActivity(otherIntent)
    }
}
