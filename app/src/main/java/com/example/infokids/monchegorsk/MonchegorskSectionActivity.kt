package com.example.infokids.monchegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R

class MonchegorskSectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monchegorsk_section)
    }

    fun OtherSection(view: View) {
        val otherIntent = Intent(this,MonchegorskOtherActivity::class.java)
        startActivity(otherIntent)
    }
    fun FotoVideoSection(view: View) {
        val FotoVideoSectionIntent = Intent(this,MonchegorskFotoVideoActivity::class.java)
        startActivity(FotoVideoSectionIntent)
    }
    fun CelebrationSection(view: View) {
        val CelebrationSectionIntent = Intent(this,MonchegorskCelebrationActivity::class.java)
        startActivity(CelebrationSectionIntent)
    }
    fun HobbySection(view: View) {
        val hobbyIntent = Intent(this,MonchegorskHobbyActivity::class.java)
        startActivity(hobbyIntent)
    }
    fun RelaxationSection(view: View) {
        val relaxationIntent = Intent(this,MonchegorskRelaxationActivity::class.java)
        startActivity(relaxationIntent)
    }
    fun MedicalSection(view: View) {
        val medicalIntent = Intent(this,MonchegorskMedicalActivity::class.java)
        startActivity(medicalIntent)
    }
    fun ShopSection(view: View) {
        val shopIntent = Intent(this,MonchegorskShopActivity::class.java)
        startActivity(shopIntent)
    }
}
