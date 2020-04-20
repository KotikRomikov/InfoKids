package com.dprk.infokids51.kandalaksha

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopClothesActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopHandMadeActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopProductForKidsActivity
import com.dprk.infokids51.kandalaksha.shop.KandalakshaShopToysActivity

class KandalakshaShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_kandalaksha_shop)
    }

    fun product_for_kids(view: View) {
        val product_for_kidsIntent = Intent(this,KandalakshaShopProductForKidsActivity::class.java)
        startActivity(product_for_kidsIntent)
    }
    fun clothes(view: View) {
        val clothesIntent = Intent(this,KandalakshaShopClothesActivity::class.java)
        startActivity(clothesIntent)
    }
    fun toys(view: View) {
        val toysIntent = Intent(this,KandalakshaShopToysActivity::class.java)
        startActivity(toysIntent)
    }
    fun hand_made(view: View) {
        val hand_madeIntent = Intent(this,KandalakshaShopHandMadeActivity::class.java)
        startActivity(hand_madeIntent)
    }
}
