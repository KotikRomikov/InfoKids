package com.dprk.infokids51

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dprk.infokids51.MainRazdelActivity.Companion.listP
import com.dprk.infokids51.MenuActivity.Companion.list
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = MyAdapter(list, this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        list.clear()
    }
}

class PartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.razdel_item_layout)

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = AdapterPart(listP, this)
    }
}