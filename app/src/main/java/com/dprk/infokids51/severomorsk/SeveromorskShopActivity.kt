package com.dprk.infokids51.severomorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.severomorsk.shop.SeveromorskShopClothesActivity
import com.dprk.infokids51.severomorsk.shop.SeveromorskShopHandMadeActivity
import com.dprk.infokids51.severomorsk.shop.SeveromorskShopProductForKidsActivity
import com.dprk.infokids51.severomorsk.shop.SeveromorskShopToysActivity
import kotlinx.android.synthetic.main.activity_severomorsk_shop.*

class SeveromorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_severomorsk_shop)


         product_for_kids.setOnClickListener {
            val productForKidsIntent =
                Intent(this, SeveromorskShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         clothes.setOnClickListener {
            val clothesIntent = Intent(this, SeveromorskShopClothesActivity::class.java)
            startActivity(clothesIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, SeveromorskShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         handMade.setOnClickListener {
            val handMadeIntent = Intent(this, SeveromorskShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}