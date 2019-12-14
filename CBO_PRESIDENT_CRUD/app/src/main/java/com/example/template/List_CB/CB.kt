package com.example.template.List_CB

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import com.example.template.R
import com.example.template.Rv_Swipe_CB.Rv_Swipe_CB_MainActivity

class CB : AppCompatActivity() {

    lateinit var listView : ListView
     var cbs:Int = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cb)

        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        for(i in 1 until cbs+1)
        {        Log.d("NewMessage","Hello")

            list.add(
                Model(

                    "CB_Name $i",
                    R.mipmap.ic_launcher_user,
                    "Edit"
                )
            )
        }



        listView.adapter = MyListAdapter(this, R.layout.row, list)
        Log.d("NewMessage","Hello")

        listView.setOnItemClickListener{parent, view, position, id ->



            for(i in 1 until cbs+1)
            {
                if (position==i){
                    val intent = Intent(this,Rv_Swipe_CB_MainActivity::class.java)
                    startActivity(intent)
                }
            }

        }

    }
}












/*
* //            if (position==1){
//                Toast.makeText(this@CB, "Item Two",   Toast.LENGTH_SHORT).show()
//            }
//            if (position==2){
//                Toast.makeText(this@CB, "Item Three", Toast.LENGTH_SHORT).show()
//            }
//            if (position==3){
//                Toast.makeText(this@CB, "Item Four",  Toast.LENGTH_SHORT).show()
//            }
//            if (position==4){
//                Toast.makeText(this@CB, "Item Five",  Toast.LENGTH_SHORT).show()
//            }
*
*
*
*         // Log.d("NewMessage","Hello")
//            for(j in 1 until cbs+1)
//            {
//                if (position==j){
//                Toast.makeText(this@CB, "Item $cbs",   Toast.LENGTH_SHORT).show()}
//
//            }
*
*
* //        list.add(
//            Model(
//                "Title One",
//                "Description One...",
//                R.mipmap.ic_launcher_user
//            )
//        )
//        list.add(
//            Model(
//                "Title Two",
//                "Description Two...",
//                R.mipmap.ic_launcher_user_round
//            )
//        )
//        list.add(
//            Model(
//                "Title Three",
//                "Description Three...",
//                R.mipmap.ic_launcher_user
//            )
//        )
//        list.add(
//            Model(
//                "Title Four",
//                "Description Four...",
//                R.mipmap.ic_launcher_user
//            )
//        )
//        list.add(
//            Model(
//                "Title Five",
//                "Description Five...",
//                R.mipmap.ic_launcher_user
//            )
//        )
* */