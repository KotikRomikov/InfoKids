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

    fun OtherSection(view: View) {}
    fun barberSection(view: View) {}
    fun FotoVideoSection(view: View) {}
    fun CelebrationSection(view: View) {}
    fun HobbySection(view: View) {}
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
