package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_razdel.*

class MainRazdelActivity : AppCompatActivity() {

    companion object {
        lateinit var mainRazdel: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main_razdel)

        val RecActivity = Intent(this, TestActivity::class.java)


        tvMed.setOnClickListener {
            mainRazdel = "MED"

            startActivity(RecActivity)
        }
        tvRelax.setOnClickListener {
            mainRazdel = "RLX"
            startActivity(RecActivity)
        }
        tvShop.setOnClickListener {
            mainRazdel = "SHP"
            startActivity(RecActivity)
        }
        tvHobby.setOnClickListener {
            mainRazdel = "HBB"
            startActivity(RecActivity)
        }
        tvCelebration.setOnClickListener {
            mainRazdel = "CLB"
            startActivity(RecActivity)
        }
        tvFotoVideo.setOnClickListener {
            mainRazdel = "FTV"
            startActivity(RecActivity)
        }
        tvGarden.setOnClickListener {
            mainRazdel = "GRD"
            startActivity(RecActivity)
        }
    }
}