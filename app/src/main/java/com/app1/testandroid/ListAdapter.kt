package com.app1.testandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView

class ListAdapter(context:Context, data:ArrayList<CustomClass>) :ArrayAdapter<CustomClass>(context, 0,data){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View? = convertView

        itemView = LayoutInflater.from(context).inflate(R.layout.custom_item,parent, false)

        val item :CustomClass? = getItem(position)
        val title:TextView = itemView!!.findViewById<TextView>(R.id.item_title)
        title.text = item!!.item_title

        val desc:TextView = itemView!!.findViewById<TextView>(R.id.item_desc)
        desc.text = item!!.item_desc

        val image_one = itemView.findViewById<ImageView>(R.id.image_one)
        image_one.setImageResource(item.image_one)

        val image_two = itemView.findViewById<ImageView>(R.id.image_two)
        image_two.setImageResource(item.image_two)

        return itemView


    }
}