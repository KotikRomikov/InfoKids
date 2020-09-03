package com.dprk.infokids51

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val list = ArrayList<ListItem>()

        list.add(
            ListItem(
                "INFO KIDS",
                "infokids@gmail.com",
                "+7 (911) 801-11-11",
                "https://vk.com",
                "184049 Кандалакша, Защитников Заполярья, 5а 15")
        )

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MyAdapter(list, this)
    }
}