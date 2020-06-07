package com.dprk.infokids51.olenegorsk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.olenegorsk.shop.OlenegorskShopClothesActivity
import com.dprk.infokids51.olenegorsk.shop.OlenegorskShopHandMadeActivity
import com.dprk.infokids51.olenegorsk.shop.OlenegorskShopProductForKidsActivity
import com.dprk.infokids51.olenegorsk.shop.OlenegorskShopToysActivity
import kotlinx.android.synthetic.main.activity_olenegorsk_shop.*

class OlenegorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_olenegorsk_shop)


         product_for_kids.setOnClickListener {
            val productForKidsIntent =
                Intent(this, OlenegorskShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         clothes.setOnClickListener {
            val clothesIntent = Intent(this, OlenegorskShopClothesActivity::class.java)
            startActivity(clothesIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, OlenegorskShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         hand_made.setOnClickListener {
            val handMadeIntent = Intent(this, OlenegorskShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}