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
                R.drawable.ic_baseline_add_circle_24,
                "Заголовок",
                "всякая чушая",
                "+91134567",
                "https://vk.com/minzdrav_51"
            )
        )
        list.add(
            ListItem(
                R.drawable.ic_baseline_add_circle_24,
                "Заголовок2",
                "всякая чушая2",
                "+9113456745",
                "https://vk.com/minzdrav_51"
            )
        )

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MyAdapter(list, this)
    }
}