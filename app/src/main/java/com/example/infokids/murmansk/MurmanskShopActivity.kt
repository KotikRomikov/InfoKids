package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.murmansk.shop.*

class MurmanskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_shop)
    }

    fun productsForKids(view: View) {
        val productsForKidsIntent = Intent(this,MurmanskProductsForKidsActivity::class.java)
        startActivity(productsForKidsIntent)
    }
    fun clothesForKids(view: View) {
        val clothesForKidsIntent = Intent(this,MurmanskClothesForKidsActivity::class.java)
        startActivity(clothesForKidsIntent)
    }
    fun shoes(view: View) {
        val shoesIntent = Intent(this,MurmanskShopShoesActivity::class.java)
        startActivity(shoesIntent)
    }
    fun toys(view: View) {
        val toysIntent = Intent(this, MurmanskShopToysActivity::class.java)
        startActivity(toysIntent)
    }

    fun handmade(view: View) {
        val handMadeIntent = Intent(this,MurmanskShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
