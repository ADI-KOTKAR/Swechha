package com.example.template.Rv_Ward

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.template.R
import kotlinx.android.synthetic.main.activity_rv__ward__main.*

class Rv_Ward_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv__ward__main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = ModelAdapter(this, Supplier.wards)
        recyclerView.adapter  = adapter
    }
}
