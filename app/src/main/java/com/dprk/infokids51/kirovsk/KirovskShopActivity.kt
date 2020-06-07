package com.dprk.infokids51.kirovsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.shop.KirovskShopHandMadeActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopProductForKidsActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopShoesActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopToysActivity
import kotlinx.android.synthetic.main.activity_kirovsk_shop.*

class KirovskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kirovsk_shop)


         productForKids.setOnClickListener {
            val productForKidsIntent = Intent(this, KirovskShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         shoes.setOnClickListener {
            val shoesIntent = Intent(this, KirovskShopShoesActivity::class.java)
            startActivity(shoesIntent)
        }

         handMade.setOnClickListener {
            val handMadeIntent = Intent(this, KirovskShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, KirovskShopToysActivity::class.java)
            startActivity(toysIntent)
        }
    }
}