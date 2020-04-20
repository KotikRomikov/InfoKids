package com.dprk.infokids51.monchegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopClothesActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopHandMadeActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopProductForKidsActivity
import com.dprk.infokids51.monchegorsk.shop.MonchegorskShopShoesActivity

class MonchegorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monchegorsk_shop)
    }

    fun product_for_kids(view: View) {
        val productForKidsIntent = Intent(this,MonchegorskShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }
    fun clothes(view: View) {
        val clothesIntent = Intent(this,MonchegorskShopClothesActivity::class.java)
        startActivity(clothesIntent)
    }
    fun shoes(view: View) {
        val shoesIntent = Intent(this,MonchegorskShopShoesActivity::class.java)
        startActivity(shoesIntent)
    }
    fun hand_made(view: View) {
        val handMadeIntent = Intent(this,MonchegorskShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
