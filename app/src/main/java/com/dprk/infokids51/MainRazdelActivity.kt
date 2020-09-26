package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.dprk.infokids51.MainActivity.Companion.city
import com.dprk.infokids51.MainActivity.Companion.database
import kotlinx.android.synthetic.main.activity_main_razdel.*

class MainRazdelActivity : AppCompatActivity() {

    companion object {
        val list = ArrayList<ListItem>()
        var listP = ArrayList<PartItem>()
    }

    lateinit var mainRazdel: String
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main_razdel)

        val RecActivity = Intent(this, PartActivity::class.java)


        tvMed.setOnClickListener {
            mainRazdel = "MED"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvRelax.setOnClickListener {
            mainRazdel = "RLX"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvShop.setOnClickListener {
            mainRazdel = "SHP"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvHobby.setOnClickListener {
            mainRazdel = "HBB"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvCelebration.setOnClickListener {
            mainRazdel = "CLB"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvFotoVideo.setOnClickListener {
            mainRazdel = "FTV"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
        tvGarden.setOnClickListener {
            mainRazdel = "GRD"
            SQL_Main_Part()
            startActivity(RecActivity)
        }
    }

    fun SQL_Main_Part() {
        val cursor =
            database.rawQuery(
                "SELECT DISTINCT partname FROM info WHERE city='$city' AND part='$mainRazdel';",
                null
            )
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            name = cursor.getString(cursor.getColumnIndex("partname"))
            Log.d("test", "заполняем массив name = $name")
            listP.add(
                PartItem(name)
            )
            Log.d("test", "заполняем массив name = ${listP[0]}")
            cursor.moveToNext()//переходим на следующую строку в таблице
        }
        cursor.close()//обязательно закрываем курсор
    }
}