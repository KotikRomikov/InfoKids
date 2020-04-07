package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class MurmanskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_section)
    }

    fun MedicalSection(view: View) {
        val murmanskMedicalIntent = Intent(this,MurmanskMedicalActivity::class.java)
        startActivity(murmanskMedicalIntent)
    }
    fun OtherSection(view: View) {
        val otherIntent = Intent(this,MurmanskOtherActivity::class.java)
        startActivity(otherIntent)
    }
    fun barberSection(view: View) {
        val barberIntent = Intent(this,MurmanskBarberActivity::class.java)
        startActivity(barberIntent)
    }
    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,MurmanskFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,MurmanskCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
    fun HobbySection(view: View) {
        val hobbyIntent = Intent(this,MurmanskHobbyActivity::class.java)
        startActivity(hobbyIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,MurmanskShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxionIntent = Intent(this,MurmanskRelaxionActivity::class.java)
        startActivity(relaxionIntent)
    }
}
