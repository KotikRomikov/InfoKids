package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopClothesActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopHandMadeActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopProductForKidsActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopToysActivity
import kotlinx.android.synthetic.main.activity_kandalaksha_shop.*

class KandalakshaShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_shop)


         product_for_kids.setOnClickListener {
            val product_for_kidsIntent =
                Intent(this, KandalakshaShopProductForKidsActivity::class.java)
            startActivity(product_for_kidsIntent)
        }

         clothes.setOnClickListener {
            val clothesIntent = Intent(this, KandalakshaShopClothesActivity::class.java)
            startActivity(clothesIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, KandalakshaShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         hand_made.setOnClickListener {
            val hand_madeIntent = Intent(this, KandalakshaShopHandMadeActivity::class.java)
            startActivity(hand_madeIntent)
        }
    }
}