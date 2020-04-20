package com.dprk.infokids51.kirovsk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.kirovsk.shop.KirovskShopHandMadeActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopProductForKidsActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopShoesActivity
import com.dprk.infokids51.kirovsk.shop.KirovskShopToysActivity

class KirovskShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirovsk_shop)
    }

    fun productForKids(view: View) {
        val productForKidsIntent = Intent(this,KirovskShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }
    fun shoes(view: View) {
        val shoesIntent = Intent(this,KirovskShopShoesActivity::class.java)
        startActivity(shoesIntent)
    }
    fun handMade(view: View) {
        val handMadeIntent = Intent(this,KirovskShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }

    fun toys(view: View) {
        val toysIntent = Intent(this,KirovskShopToysActivity::class.java)
        startActivity(toysIntent)
    }
}
