package com.example.infokids.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class KandalakshaSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kandalaksha_section)
    }

    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {
        val HobbySectionIntent = Intent(this,KandalakshaHobbyActivity::class.java)
        startActivity(HobbySectionIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,KandalakshaShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun RelaxationSection(view: View) {
        val RelaxationSectionIntent = Intent(this,KandalakshaRelaxationActivity::class.java)
        startActivity(RelaxationSectionIntent)
    }
    fun MedicalSection(view: View) {
        val MedicalSectionIntent = Intent(this,KandalakshaMedicalActivity::class.java)
        startActivity(MedicalSectionIntent)
    }
}
