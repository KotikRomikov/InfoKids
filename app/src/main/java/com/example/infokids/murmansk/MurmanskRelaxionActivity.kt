package com.example.infokids.murmansk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.infokids.R
import com.example.infokids.murmansk.relaxtion.*
import com.example.infokids.murmansk.relaxtion.MurmanskOtherRelaxionActivity

class MurmanskRelaxionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_murmansk_relaxion)
    }

    fun gamePlace(view: View) {
        val gamePlaceIntent = Intent(this,MurmanskGamePlaceActivity::class.java)
        startActivity(gamePlaceIntent)
    }

    fun quest(view: View) {
        val questIntent = Intent(this,MurmanskQuestActivity::class.java)
        startActivity(questIntent)
    }

    fun sport(view: View) {
        val sportIntent = Intent(this,MurmanskSportActivity::class.java)
        startActivity(sportIntent)
    }

    fun antiKafe(view: View) {
        val antiKafeIntent = Intent(this,MurmanskAntiKafeActivity::class.java)
        startActivity(antiKafeIntent)
    }
    fun intellectGame(view: View) {
        val intellectGameIntent = Intent(this,MurmanskIntellectGameActivity::class.java)
        startActivity(intellectGameIntent)
    }
    fun kidsOrganization(view: View) {
        val kidsOrganizationIntent = Intent(this,MurmanskKidsOrganizationActivity::class.java)
        startActivity(kidsOrganizationIntent)
    }
    fun zoo(view: View) {
        val zooIntent = Intent(this,MurmanskZooActivity::class.java)
        startActivity(zooIntent)
    }
    fun culture(view: View) {
        val cultureIntent = Intent(this,MurmanskCultureActivity::class.java)
        startActivity(cultureIntent)
    }
    fun other(view: View) {
        val otherIntent = Intent(this,MurmanskOtherRelaxionActivity::class.java)
        startActivity(otherIntent)
    }
}
