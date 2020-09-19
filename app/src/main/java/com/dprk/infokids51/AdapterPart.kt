package com.dprk.infokids51

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPart(listArray: ArrayList<PartItem>, context: Context) :
    RecyclerView.Adapter<AdapterPart.ViewHolder>() {

    companion object {
        lateinit var namePartText: String
    }

    var ContextP = context
    var listArrayP = listArray

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val namePart = view.findViewById<TextView>(R.id.Part)

        fun bind(listItem: PartItem, context: Context) {
            namePart.text = listItem.namePart

            itemView.setOnClickListener() {
                namePartText = namePart.text.toString()
                TargetSQL(context).TargetSQL(context)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(ContextP)
        return ViewHolder(inflater.inflate(R.layout.razdel_item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return listArrayP.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listArray = listArrayP[position]
        holder.bind(listArray, ContextP)
    }
}
