package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.MainActivity.Companion.db
import com.dprk.infokids51.apatiti.ApatitiSectionActivity
import com.dprk.infokids51.kirovsk.KirovskSectionActivity
import com.dprk.infokids51.monchegorsk.MonchegorskSectionActivity
import com.dprk.infokids51.olenegorsk.OlenegorskSectionActivity
import com.dprk.infokids51.severomorsk.SeveromorskSectionActivity
import com.dprk.infokids51.zori.ZoriSectionActivity


class MenuActivity : AppCompatActivity() {

    companion object{
        val list = ArrayList<ListItem>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_menu)

        MurmanskRazdel.setOnClickListener {
            val murmanskRazdelIntent = Intent(
                this,
                MainRazdelActivity::class.java
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

             var name: String
             var email: String
             var tel: String
             var web: String
             var locate: String
             var info: String


             val cursor = db.rawQuery("SELECT * FROM info WHERE city='KND';", null) // запрашиваем данные из таблицы через SQL запрос, должен быть динамический!
             cursor.moveToFirst() //перемещаем курсор (таблицу) с результатами в начало
             while (!cursor.isAfterLast){
                 name = cursor.getString(cursor.getColumnIndex("name"))
                 email = cursor.getString(cursor.getColumnIndex("email"))
                 tel=cursor.getString(cursor.getColumnIndex("tel"))
                 web=cursor.getString(cursor.getColumnIndex("web"))
                 locate = cursor.getString(cursor.getColumnIndex("locate"))
                 info = cursor.getString(cursor.getColumnIndex("info"))

                 list.add(
                     ListItem(name, email, tel, web, locate, info)
                 )

                 cursor.moveToNext()//переходим на следующую строку в таблице
                 //пишем в лог консоли, что получили на каждой строке
                 Log.d("CURSOR", "TEL = $tel")
                 Log.d("CURSOR", "NAME = $name")
                 Log.d("CURSOR", "EMAIL = $email")
             }
             cursor.close()//обязательно закрываем курсор

             val kandalakshaSectionIntent = Intent(this, TestActivity::class.java)
             startActivity(kandalakshaSectionIntent)
         }

        `@+id/tvMRM`.setOnClickListener {
            val kandalakshaSectionIntent = Intent(this, TestActivity::class.java)
            startActivity(kandalakshaSectionIntent)
        }
    }
}
