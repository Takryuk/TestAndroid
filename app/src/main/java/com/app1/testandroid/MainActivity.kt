package com.app1.testandroid

import android.app.Dialog
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayData()

    }
    fun displayData() {

        val items = ArrayList<CustomClass>()
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )
        items.add(
            CustomClass(
                "App Development",
                "LEarn Anything",
                R.drawable.animation1,
                R.drawable.animation2
            )
        )

        val adapter = ListAdapter(this@MainActivity, items)
        val list = findViewById<ListView>(R.id.list_view)

        list.adapter = adapter


        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val alert = Dialog(this@MainActivity)
            alert.setContentView(R.layout.alert_item)
            val title = alert.findViewById<TextView>(R.id.title)
            val desc = alert.findViewById<TextView>(R.id.desc)
            val image_one = alert.findViewById<ImageView>(R.id.image_one)
            val image_two = alert.findViewById<ImageView>(R.id.image_two)
            val close = alert.findViewById<Button>(R.id.close)

            val itemData = adapter.getItem(position)
            title.text = itemData?.item_title
            desc.text = itemData?.item_desc


            image_one.setImageResource(itemData?.image_one!!)
            image_two.setImageResource(itemData?.image_two!!)

            alert.show()

            close.setOnClickListener {
                alert.hide()
            }


        }
    }
}
