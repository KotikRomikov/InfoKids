package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class ZoriSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_section)
    }

    fun MedicalSection(view: View) {
        val MedicalSectionIntent = Intent(this,ZoriMedicalActivity::class.java)
        startActivity(MedicalSectionIntent)
    }
    fun OtherSection(view: View) {
        val otherIntent = Intent(this,ZoriOtherActivity::class.java)
        startActivity(otherIntent)
    }
    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,ZoriFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,ZoriCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
    fun HobbySection(view: View) {
        val HobbySectionIntent = Intent(this,ZoriHobbyActivity::class.java)
        startActivity(HobbySectionIntent)
    }
    fun ShopSection(view: View) {
        val ShopSectionIntent = Intent(this,ZoriShopActivity::class.java)
        startActivity(ShopSectionIntent)
    }
    fun RelaxationSection(view: View) {
        val RelaxationSectionIntent = Intent(this,ZoriRelaxationActivity::class.java)
        startActivity(RelaxationSectionIntent)
    }
}
