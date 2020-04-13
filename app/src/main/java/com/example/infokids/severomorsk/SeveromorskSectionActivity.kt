package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class SeveromorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_section)
    }

    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {
        val severomorskHobbyIntent = Intent(this,SeveromorskHobbyActivity::class.java)
        startActivity(severomorskHobbyIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent =  Intent(this,SeveromorskShopActivity::class.java)
        startActivity(shopIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxtionIntent = Intent(this,SeveromorskRelaxtionActivity::class.java)
        startActivity(relaxtionIntent)
    }
    fun MedicalSection(view: View) {
        val severomorskMedicalIntent = Intent(this,SeveromorskMedicalActivity::class.java)
        startActivity(severomorskMedicalIntent)
    }
}
