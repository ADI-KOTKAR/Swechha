package com.example.template.Rv_Swipe_CB

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.template.Form.Form
import com.example.template.R
import com.example.template.Rv_Swipe_CB.Adapter.MyAdapter
import com.example.template.Rv_Swipe_CB.Helper.MyButton
import com.example.template.Rv_Swipe_CB.Helper.MySwipeHelper
import com.example.template.Rv_Swipe_CB.Listener.MyButtonClickListener
import com.example.template.Rv_Swipe_CB.Model.Item
import kotlinx.android.synthetic.main.activity_rv__swipe__cb__main.*

class Rv_Swipe_CB_MainActivity : AppCompatActivity() {

    lateinit var adapter : MyAdapter
    lateinit var layoutManage: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv__swipe__cb__main)

        recycler_test.setHasFixedSize(true)
        layoutManage = LinearLayoutManager(this)
        recycler_test.layoutManager = layoutManage

        val intent = Intent(this, Form::class.java)

        //Add swipe
        val swipe = object : MySwipeHelper(this,recycler_test,200)
        {
            override fun instantiateMyButton( viewHolder: RecyclerView.ViewHolder, buffer: MutableList<MyButton>)
            {
                //Add Button
                buffer.add((MyButton(this@Rv_Swipe_CB_MainActivity,
                    "Delete",
                30,
                    0,
                    Color.parseColor("#FF3C30"),
                    object:MyButtonClickListener{
                        override fun onClick(pos: Int) {
                            Toast.makeText(this@Rv_Swipe_CB_MainActivity,"DELETE ID"+pos,Toast.LENGTH_SHORT).show()
                        }

                    })))

                buffer.add((MyButton(this@Rv_Swipe_CB_MainActivity,
                    "Update",
                    30,
                    0,
                    //R.drawable.ic_launcher_edit_foreground,
                    Color.parseColor("#FF9502"),
                    object:MyButtonClickListener{

                        override fun onClick(pos: Int) {

                            startActivity(intent)

                        }

                    })))
            }

        }

        generateItem()



    }

    private fun generateItem(){
        val itemList = ArrayList<Item>()
        var i=0
        while(i<50)
        {
            //var img = findViewById(R.id.cart_image)
            itemList.add(Item("CB_NAME"+ ++i,"C:\\Users\\Aditya\\AndroidStudioProjects\\Template\\app\\src\\main\\res\\drawable\\ic_launcher_user_foreground.xml"))

        }
        adapter = MyAdapter(this,itemList)
        recycler_test.adapter = adapter
    }

}
