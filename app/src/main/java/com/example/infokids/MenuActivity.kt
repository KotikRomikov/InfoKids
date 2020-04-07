package com.example.infokids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.apatiti.ApatitiSectionActivity
import com.example.infokids.kandalaksha.KandalakshaSectionActivity
import com.example.infokids.kirovsk.KirovskSectionActivity
import com.example.infokids.monchegorsk.MonchegorskSectionActivity
import com.example.infokids.murmansk.MurmanskSectionActivity
import com.example.infokids.olenegorsk.OlenegorskSectionActivity
import com.example.infokids.severomorsk.SeveromorskSectionActivity
import com.example.infokids.zori.ZoriSectionActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    fun NewYearRazdel(view: View) {
        val newYearSectionIntent = Intent(this,NewYearActivity::class.java)
        startActivity(newYearSectionIntent)
    }

}
