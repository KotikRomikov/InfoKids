package com.example.infokids.zori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.zori.shop.ZoriShopHandMadeActivity
import com.example.infokids.zori.shop.ZoriShopProductForKidsActivity
import com.example.infokids.zori.shop.ZoriShopToysActivity

class ZoriShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
