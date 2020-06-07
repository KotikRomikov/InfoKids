package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.shop.*
import kotlinx.android.synthetic.main.activity_murmansk_shop.*

class MurmanskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_murmansk_shop)


         productsForKids.setOnClickListener {
            val productsForKidsIntent = Intent(this, MurmanskProductsForKidsActivity::class.java)
            startActivity(productsForKidsIntent)
        }

         clothesForKids.setOnClickListener {
            val clothesForKidsIntent = Intent(this, MurmanskClothesForKidsActivity::class.java)
            startActivity(clothesForKidsIntent)
        }

         shoes.setOnClickListener {
            val shoesIntent = Intent(this, MurmanskShopShoesActivity::class.java)
            startActivity(shoesIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, MurmanskShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         handmade.setOnClickListener {
            val handMadeIntent = Intent(this, MurmanskShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}