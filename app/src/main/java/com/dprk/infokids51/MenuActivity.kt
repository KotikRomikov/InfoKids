package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
             //тут должна быть переменная что-то вроде city:String = "KND", для динамического SQL запроса
             //тут должен быть объявлен массив для ресайкла val list = ArrayList<ListItem>()

             var key : Int
             var name: String
             var email: String
             val cursor = db.rawQuery("SELECT * FROM testtable;", null) // запрашиваем данные из таблицы через SQL запрос, должен быть динамический!
             cursor.moveToFirst() //перемещаем курсор (таблицу) с результатами в начало
             while (!cursor.isAfterLast){
                 key = cursor.getInt(cursor.getColumnIndex("KEY_id"))
                 name = cursor.getString(cursor.getColumnIndex("NAME"))
                 email = cursor.getString(cursor.getColumnIndex("EMAIL"))
                 /*
                 тут можно заполнять массив для ресайкла данными
                 list.add(
                 ListItem(
                 R.drawable.ic_baseline_add_circle_24,
                 "Заголовок",
                 "всякая чушая",
                 "+91134567",
                 "https://vk.com/minzdrav_51"
                 )
                 )
                 */
                 cursor.moveToNext()//переходим на следующую строку в таблице
                 //пишем в лог консоли, что получили на каждой строке
                 Log.d("CURSOR", "KEY_id = $key")
                 Log.d("CURSOR", "NAME = $name")
                 Log.d("CURSOR", "EMAIL = $email")
             }
             cursor.close()//обязательно закрываем курсор

             val kandalakshaSectionIntent = Intent(this, TestActivity::class.java)
             startActivity(kandalakshaSectionIntent)
         }

        textView.setOnClickListener {
            val kandalakshaSectionIntent = Intent(this, TestActivity::class.java)
            startActivity(kandalakshaSectionIntent)
        }

    }
}
