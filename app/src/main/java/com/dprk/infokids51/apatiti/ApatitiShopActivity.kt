package com.dprk.infokids51.apatiti

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.apatiti.shop.*

class ApatitiShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_apatiti_shop)
    }

    fun productForKids(view: View) {
        val productForKidsIntent = Intent(this,ApatitiShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }
    fun clothes(view: View) {
        val clothesIntent = Intent(this,ApatitiShopClothesActivity::class.java)
        startActivity(clothesIntent)
    }
    fun shoes(view: View) {
        val shoesIntent = Intent(this,ApatitiShopShoesActivity::class.java)
        startActivity(shoesIntent)
    }
    fun toys(view: View) {
        val toysIntent = Intent(this,ApatitiShopToysActivity::class.java)
        startActivity(toysIntent)
    }
    fun handMade(view: View) {
        val handMadeIntent = Intent(this,ApatitiShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
