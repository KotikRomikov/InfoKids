package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R

class MurmanskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
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
