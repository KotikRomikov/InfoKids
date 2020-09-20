package com.dprk.infokids51

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.dprk.infokids51.AdapterPart.Companion.namePartText
import com.dprk.infokids51.MainActivity.Companion.city

class TargetSQL(context: Context) {

    val contextX = context


    fun TargetSQL(context: Context) {
        //тут должна быть переменная что-то вроде city:String = "KND", для динамического SQL запроса
        //тут должен быть объявлен массив для ресайкла val list = ArrayList<ListItem>()

        var name: String
        var email: String
        var tel: String
        var web: String
        var locate: String
        var info: String


        val cursor = MainActivity.db.rawQuery(
            "SELECT * FROM info WHERE city='$city' AND partname='$namePartText';",
            null
        ) // запрашиваем данные из таблицы через SQL запрос, должен быть динамический!
        cursor.moveToFirst() //перемещаем курсор (таблицу) с результатами в начало
        while (!cursor.isAfterLast) {
            name = cursor.getString(cursor.getColumnIndex("name"))
            email = cursor.getString(cursor.getColumnIndex("email"))
            tel = cursor.getString(cursor.getColumnIndex("tel"))
            web = cursor.getString(cursor.getColumnIndex("web"))
            locate = cursor.getString(cursor.getColumnIndex("locate"))
            info = cursor.getString(cursor.getColumnIndex("info"))

            MainRazdelActivity.list.add(
                ListItem(name, email, tel, web, locate, info)
            )

            cursor.moveToNext()//переходим на следующую строку в таблице
            //пишем в лог консоли, что получили на каждой строке
            Log.d("CURSOR", "TEL = $tel")
            Log.d("CURSOR", "NAME = $name")
            Log.d("CURSOR", "EMAIL = $email")
        }
        cursor.close()//обязательно закрываем курсор
        val x = Intent(contextX, TestActivity::class.java)
        startActivity(context, x, null)

    }

}