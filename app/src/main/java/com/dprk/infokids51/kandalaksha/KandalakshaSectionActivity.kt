package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class KandalakshaSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_section)
    }

    fun FotoVideoSection(view: View) {
        val fotoVideoIntent = Intent(this,KandalakshaFotoVideoActivity::class.java)
        startActivity(fotoVideoIntent)
    }
    fun CelebrationSection(view: View) {
        val celebrationIntent = Intent(this,KandalakshaCelebrationActivity::class.java)
        startActivity(celebrationIntent)
    }
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
