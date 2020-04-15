package com.example.infokids.kandalaksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.kandalaksha.shop.KandalakshaShopClothesActivity
import com.example.infokids.kandalaksha.shop.KandalakshaShopHandMadeActivity
import com.example.infokids.kandalaksha.shop.KandalakshaShopProductForKidsActivity
import com.example.infokids.kandalaksha.shop.KandalakshaShopToysActivity

class KandalakshaShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
