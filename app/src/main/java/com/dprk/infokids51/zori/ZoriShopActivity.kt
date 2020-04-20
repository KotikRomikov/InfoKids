package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.shop.ZoriShopHandMadeActivity
import com.dprk.infokids51.zori.shop.ZoriShopProductForKidsActivity
import com.dprk.infokids51.zori.shop.ZoriShopToysActivity

class ZoriShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_shop)
    }

    fun productForKids(view: View) {
        val productForKidsIntent = Intent(this,ZoriShopProductForKidsActivity::class.java)
        startActivity(productForKidsIntent)
    }
    fun toys(view: View) {
        val toysIntent = Intent(this,ZoriShopToysActivity::class.java)
        startActivity(toysIntent)
    }
    fun handMade(view: View) {
        val handMadeIntent = Intent(this,ZoriShopHandMadeActivity::class.java)
        startActivity(handMadeIntent)
    }
}
