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

    fun MedicalSection(view: View) {
        val medicalIntent = Intent(this,ApatitiMedicalActivity::class.java)
        startActivity(medicalIntent)
    }
    fun RelaxationSection(view: View) {}
    fun ShopSection(view: View) {}
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
