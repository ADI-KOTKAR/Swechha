package com.example.template.List_Ward

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.template.R

class List_Ward_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list__ward__main)

        //listview
        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        //adding items to listview

        for(i in 1..51)
        {
            list.add(Model("Ward $i"))
        }

        listview.adapter = MyListAdapter(this,R.layout.row_ward, list)

        //onitem click
        listview.setOnItemClickListener(){parent,view,position,id ->
            for(i in 1..51)
            {
                if(position==i)
                {
                    Toast.makeText(this@List_Ward_MainActivity,"Ward $i clicked",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
