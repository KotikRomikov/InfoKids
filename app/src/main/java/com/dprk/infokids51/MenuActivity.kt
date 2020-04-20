package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dprk.infokids51.apatiti.ApatitiSectionActivity
import com.dprk.infokids51.kandalaksha.KandalakshaSectionActivity
import com.dprk.infokids51.kirovsk.KirovskSectionActivity
import com.dprk.infokids51.monchegorsk.MonchegorskSectionActivity
import com.dprk.infokids51.murmansk.MurmanskSectionActivity
import com.dprk.infokids51.olenegorsk.OlenegorskSectionActivity
import com.dprk.infokids51.severomorsk.SeveromorskSectionActivity
import com.dprk.infokids51.zori.ZoriSectionActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_menu)
    }

    fun MurmanskRazdel(view: View) {
        val murmanskRazdelIntent = Intent(this,
            MurmanskSectionActivity::class.java)
        startActivity(murmanskRazdelIntent)
    }
    fun SeveromorskRazdel(view: View) {
        val severomorskSectionIntent = Intent(this,SeveromorskSectionActivity::class.java)
        startActivity(severomorskSectionIntent)
    }
    fun OlenegorskRazdel(view: View) {
        val olenegorskSectionIntent = Intent(this, OlenegorskSectionActivity::class.java)
        startActivity(olenegorskSectionIntent)
    }
    fun MonchegorskRazdel(view: View) {
        val monchegorskSectionIntent = Intent(this, MonchegorskSectionActivity::class.java)
        startActivity(monchegorskSectionIntent)
    }
    fun ApatitiRazdel(view: View) {
        val apatitiSectionIntent = Intent(this, ApatitiSectionActivity::class.java)
        startActivity(apatitiSectionIntent)
    }
    fun KirovskRazdel(view: View) {
        val kirovskSectionIntent = Intent(this, KirovskSectionActivity::class.java)
        startActivity(kirovskSectionIntent)
    }
    fun ZoriRazdel(view: View) {
        val zoriSectionIntent = Intent(this,ZoriSectionActivity::class.java)
        startActivity(zoriSectionIntent)
    }
    fun KandalakshaRazdel(view: View) {
        val kandalakshaSectionIntent = Intent(this,KandalakshaSectionActivity::class.java)
        startActivity(kandalakshaSectionIntent)
    }


}
