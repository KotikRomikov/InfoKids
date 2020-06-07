package com.dprk.infokids51.zori

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.R
import com.dprk.infokids51.zori.shop.ZoriShopHandMadeActivity
import com.dprk.infokids51.zori.shop.ZoriShopProductForKidsActivity
import com.dprk.infokids51.zori.shop.ZoriShopToysActivity
import kotlinx.android.synthetic.main.activity_zori_shop.*

class ZoriShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_zori_shop)


         productForKids.setOnClickListener {
            val productForKidsIntent = Intent(this, ZoriShopProductForKidsActivity::class.java)
            startActivity(productForKidsIntent)
        }

         toys.setOnClickListener {
            val toysIntent = Intent(this, ZoriShopToysActivity::class.java)
            startActivity(toysIntent)
        }

         handMade.setOnClickListener {
            val handMadeIntent = Intent(this, ZoriShopHandMadeActivity::class.java)
            startActivity(handMadeIntent)
        }
    }
}