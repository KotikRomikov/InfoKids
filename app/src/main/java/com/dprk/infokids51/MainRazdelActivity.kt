package com.dprk.infokids51

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_razdel.*

class MainRazdelActivity : AppCompatActivity() {

    companion object {
        lateinit var mainRazdel: String
        var listP = ArrayList<PartItem>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContentView(R.layout.activity_main_razdel)

        val RecActivity = Intent(this, TestActivity::class.java)


        tvMed.setOnClickListener {
            mainRazdel = "MED"

            var name: String

            val cursor = MainActivity.db.rawQuery("SELECT * FROM part;", null)
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                name = cursor.getString(cursor.getColumnIndex("name"))
                Log.d("test", "заполняем массив name = $name")
                listP.add(PartItem(name))
                cursor.moveToNext()//переходим на следующую строку в таблице
            }
            cursor.close()//обязательно закрываем курсор

            startActivity(RecActivity)
        }
        tvRelax.setOnClickListener {
            mainRazdel = "RLX"
            startActivity(RecActivity)
        }
        tvShop.setOnClickListener {
            mainRazdel = "SHP"
            startActivity(RecActivity)
        }
        tvHobby.setOnClickListener {
            mainRazdel = "HBB"
            startActivity(RecActivity)
        }
        tvCelebration.setOnClickListener {
            mainRazdel = "CLB"
            startActivity(RecActivity)
        }
        tvFotoVideo.setOnClickListener {
            mainRazdel = "FTV"
            startActivity(RecActivity)
        }
        tvGarden.setOnClickListener {
            mainRazdel = "GRD"
            startActivity(RecActivity)
        }
    }
}