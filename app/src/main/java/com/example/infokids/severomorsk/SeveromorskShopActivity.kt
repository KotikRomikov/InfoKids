package com.example.infokids.severomorsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.severomorsk.shop.SeveromorskShopClothesActivity
import com.example.infokids.severomorsk.shop.SeveromorskShopHandMadeActivity
import com.example.infokids.severomorsk.shop.SeveromorskShopProductForKidsActivity
import com.example.infokids.severomorsk.shop.SeveromorskShopToysActivity

class SeveromorskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_severomorsk_shop)
    }

    fun product_for_kids(view: View) {
        val productForKidsIntent = Intent(this,SeveromorskShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }

    fun clothes(view: View) {
        val clothesIntent = Intent(this,SeveromorskShopClothesActivity::class.java)
        startActivity(clothesIntent)
    }

    fun toys(view: View) {
        val toysIntent = Intent(this,SeveromorskShopToysActivity::class.java)
        startActivity(toysIntent)
    }
    fun handMade(view: View) {
        val handMadeIntent = Intent(this,SeveromorskShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
