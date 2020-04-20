package com.dprk.infokids51.murmansk

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.murmansk.shop.*

class MurmanskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
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
