package com.example.template.Rv_Ward

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.template.R
import com.example.template.Rv_Swipe_CB.Rv_Swipe_CB_MainActivity
import kotlinx.android.synthetic.main.list_item_ward.view.*

class ModelAdapter(val context:Context, val wards: List<Model>) : RecyclerView.Adapter<ModelAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_ward,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wards.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val ward = wards[position]
        holder.setData(ward, position)
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var currentWard: Model? = null
        var currentPosition:Int = 0

        init {
            itemView.setOnClickListener{
                //Toast.makeText(context, currentWard!!.title + "Clicked!",Toast.LENGTH_SHORT).show()
               val intent =  Intent(context,Rv_Swipe_CB_MainActivity::class.java)
                context.startActivity(intent)



            }
        }

        fun setData(ward: Model, pos: Int){
                itemView.titleTv.text = ward!!.title

            this.currentWard =  ward
            this.currentPosition = pos
        }
    }
}