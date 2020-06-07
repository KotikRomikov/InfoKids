package com.dprk.infokids51.monchegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopClothesActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopHandMadeActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopProductForKidsActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopShoesActivity
import kotlinx.android.synthetic.main.activity_monchegorsk_shop.*

class MonchegorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_monchegorsk_shop)


         product_for_kids.setOnClickListener {
            val productForKidsIntent =
                Intent(this, MonchegorskShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         clothes.setOnClickListener {
            val clothesIntent = Intent(this, MonchegorskShopClothesActivity::class.java)
            startActivity(clothesIntent)
        }

         shoes.setOnClickListener {
            val shoesIntent = Intent(this, MonchegorskShopShoesActivity::class.java)
            startActivity(shoesIntent)
        }

         hand_made.setOnClickListener {
            val handMadeIntent = Intent(this, MonchegorskShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}