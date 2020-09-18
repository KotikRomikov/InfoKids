package com.dprk.infokids51

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


        tvMed.setOnClickListener {
            mainRazdel = "MED"
        }
        tvRelax.setOnClickListener {
            mainRazdel = "RLX"
        }
        tvShop.setOnClickListener {
            mainRazdel = "SHP"
        }
        tvHobby.setOnClickListener {
            mainRazdel = "HBB"
        }
        tvCelebration.setOnClickListener {
            mainRazdel = "CLB"
        }
        tvFotoVideo.setOnClickListener {
            mainRazdel = "FTV"
        }
        tvGarden.setOnClickListener {
            mainRazdel = "GRD"
        }
    }
}