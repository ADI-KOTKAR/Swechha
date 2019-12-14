package com.example.template.List_Ward

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.template.List_CB.Model
import com.example.template.R

class MyListAdapter(var mCtx: Context, var resource:Int, var items: MutableList<com.example.template.List_Ward.Model>)
    : ArrayAdapter<com.example.template.List_Ward.Model>( mCtx , resource , items ){




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        //inflate layout
        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )

        //val imageView : ImageView = view.findViewById(R.id.iconIv)

        var textView : TextView = view.findViewById(R.id.titleTv)

       // var addView: Button = view.findViewById(R.id.add_icon)
        //var textView1 : TextView = view.findViewById(R.id.descTv)



        var mItems : com.example.template.List_Ward.Model = items[position]

        //imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = mItems.title
        // addView.setCompoundDrawables(mCtx.resources.getDrawable(person.add))
        //textView1.text = person.desc


        return view
    }

}