package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.shop.*
import kotlinx.android.synthetic.main.activity_apatiti_shop.*

class ApatitiShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_shop)


         productForKids.setOnClickListener {
            val productForKidsIntent = Intent(this, ApatitiShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         clothes.setOnClickListener {
            val clothesIntent = Intent(this, ApatitiShopClothesActivity::class.java)
            startActivity(clothesIntent)
        }

         shoes.setOnClickListener {
            val shoesIntent = Intent(this, ApatitiShopShoesActivity::class.java)
            startActivity(shoesIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, ApatitiShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         handMade.setOnClickListener {
            val handMadeIntent = Intent(this, ApatitiShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}