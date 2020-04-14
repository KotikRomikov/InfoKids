package com.example.infokids.olenegorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.olenegorsk.shop.OlenegorskShopClothesActivity
import com.example.infokids.olenegorsk.shop.OlenegorskShopHandMadeActivity
import com.example.infokids.olenegorsk.shop.OlenegorskShopProductForKidsActivity
import com.example.infokids.olenegorsk.shop.OlenegorskShopToysActivity

class OlenegorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olenegorsk_shop)
    }

    fun product_for_kids(view: View) {
        val productForKidsIntent = Intent(this,OlenegorskShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }
    fun clothes(view: View) {
        val clothesIntent = Intent(this,OlenegorskShopClothesActivity::class.java)
        startActivity(clothesIntent)
    }
    fun toys(view: View) {
        val toysIntent = Intent(this,OlenegorskShopToysActivity::class.java)
        startActivity(toysIntent)
    }
    fun hand_made(view: View) {
        val handMadeIntent = Intent(this,OlenegorskShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
