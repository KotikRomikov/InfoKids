package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.database.Cursor
import android.database.DatabaseErrorHandler
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.MainActivity.Companion.MenuButtonID
import com.dprk.infokids51.MainActivity.Companion.db
import com.dprk.infokids51.apatiti.ApatitiSectionActivity
import com.dprk.infokids51.kirovsk.KirovskSectionActivity
import com.dprk.infokids51.monchegorsk.MonchegorskSectionActivity
import com.dprk.infokids51.murmansk.MurmanskSectionActivity
import com.dprk.infokids51.olenegorsk.OlenegorskSectionActivity
import com.dprk.infokids51.severomorsk.SeveromorskSectionActivity
import com.dprk.infokids51.zori.ZoriSectionActivity
import kotlinx.android.synthetic.main.activity_menu.*


class MenuActivity : AppCompatActivity() {
    var DbHandler : DatabaseHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_menu)

        MurmanskRazdel.setOnClickListener {
            val murmanskRazdelIntent = Intent(
                this,
                MurmanskSectionActivity::class.java
            )
            startActivity(murmanskRazdelIntent)
        }

         SeveromorskRazdel.setOnClickListener {
            val severomorskSectionIntent = Intent(this, SeveromorskSectionActivity::class.java)
            startActivity(severomorskSectionIntent)
        }

         OlenegorskRazdel.setOnClickListener {
            val olenegorskSectionIntent = Intent(this, OlenegorskSectionActivity::class.java)
            startActivity(olenegorskSectionIntent)
        }

         MonchegorskRazdel.setOnClickListener {
            val monchegorskSectionIntent = Intent(this, MonchegorskSectionActivity::class.java)
            startActivity(monchegorskSectionIntent)
        }

         ApatitiRazdel.setOnClickListener {
            val apatitiSectionIntent = Intent(this, ApatitiSectionActivity::class.java)
            startActivity(apatitiSectionIntent)
        }

         KirovskRazdel.setOnClickListener {
            val kirovskSectionIntent = Intent(this, KirovskSectionActivity::class.java)
            startActivity(kirovskSectionIntent)
        }

         ZoriRazdel.setOnClickListener {
            val zoriSectionIntent = Intent(this, ZoriSectionActivity::class.java)
            startActivity(zoriSectionIntent)
        }

         KandalakshaRazdel.setOnClickListener {

             var key : Int= 125
             var name = ""
             var email = ""
             val cursor = db.rawQuery("SELECT * FROM testtable;", null)
             cursor.moveToFirst()
             while (!cursor.isAfterLast){
                 key = cursor.getInt(cursor.getColumnIndex("KEY_id"))
                 name = cursor.getString(cursor.getColumnIndex("NAME"))
                 email = cursor.getString(cursor.getColumnIndex("EMAIL"))
                 cursor.moveToNext()
                 Log.d("CURSOR", "KEY_id = $key")
                 Log.d("CURSOR", "NAME = $name")
                 Log.d("CURSOR", "EMAIL = $email")

             }
             cursor.close()

             //Toast.makeText(this, "${MenuButtonID}", Toast.LENGTH_SHORT).show()
             val numm: Long = MenuButtonID + KandalakshaRazdel.id.toLong()
             when {
                 numm == 4262461469 -> {
                     val kandalakshaSectionIntent = Intent(this, TestActivity::class.java)
                     startActivity(kandalakshaSectionIntent)
                 }
             }
//             val kandalakshaSectionIntent = Intent(this, KandalakshaSectionActivity::class.java)
//            startActivity(kandalakshaSectionIntent)
         }

    }
}
