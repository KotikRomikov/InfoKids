package com.dprk.infokids51

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dprk.infokids51.MainRazdelActivity.Companion.listP
import kotlinx.android.synthetic.main.activity_test.*

class PartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        rec_view.hasFixedSize()
        rec_view.layoutManager = LinearLayoutManager(this)

        rec_view.adapter = AdapterPart(listP, this)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        listP.clear()
    }
}