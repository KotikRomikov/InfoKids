package com.dprk.infokids51.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class SeveromorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_section)
    }

    fun OtherSection(view: View) {
        val otherIntent = Intent(this,SeveromorskOtherActivity::class.java)
        startActivity(otherIntent)
    }
        fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,SeveromorskFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,SeveromorskCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
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
