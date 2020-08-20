package com.dprk.infokids51

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(listArray: ArrayList<ListItem>, context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var listArrayR = listArray
    var contextR = context


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val titleText = view.findViewById<TextView>(R.id.titleText)
        val contentText = view.findViewById<TextView>(R.id.contentText)
        val image_id = view.findViewById<ImageView>(R.id.image_id)
        val telNumber = view.findViewById<TextView>(R.id.telNumber)
        val linkVK = view.findViewById<TextView>(R.id.linkVK)


        fun bind(listItem: ListItem, context: Context) {
            titleText.text = listItem.titleText
            contentText.text = listItem.contentText
            image_id.setImageResource(listItem.image_id)
            telNumber.text = listItem.telNumber
            linkVK.text = listItem.linkVK
            itemView.setOnClickListener() {
                Toast.makeText(context, "Pressed: ${titleText.text}", Toast.LENGTH_SHORT).show()
            }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listArrayR[position]
        holder.bind(listItem, contextR)
    }

}