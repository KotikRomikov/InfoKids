package com.dprk.infokids51

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MyAdapter(listArray: ArrayList<ListItem>, context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val locateCompany = view.findViewById<TextView>(R.id.locationCompany)
        val nameCompany = view.findViewById<TextView>(R.id.nameCompany)
        val emailCompany = view.findViewById<TextView>(R.id.emailCompany)
        val telNumber = view.findViewById<TextView>(R.id.telCompany)
        val webLink = view.findViewById<TextView>(R.id.webCompany)

        fun bind(listItem: ListItem, context: Context) {
            nameCompany.text = listItem.nameCompany
            emailCompany.text = listItem.emailCompany
            telNumber.text = listItem.telCompany
            webLink.text = listItem.webCompany
            locateCompany.text = listItem.locateCompany

            itemView.setOnClickListener() {
                //Toast.makeText(context, "Pressed: ${listItem.infoCompany}", Toast.LENGTH_SHORT).show()
                MaterialAlertDialogBuilder(context)
                    .setTitle(nameCompany.text)
                    .setMessage(listItem.infoCompany)
                    .show()
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

