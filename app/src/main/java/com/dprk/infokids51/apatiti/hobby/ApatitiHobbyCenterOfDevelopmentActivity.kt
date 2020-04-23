package com.dprk.infokids51.apatiti.hobby

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dprk.infokids51.R

class ApatitiHobbyCenterOfDevelopmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_hobby_center_of_development)
    }
}
