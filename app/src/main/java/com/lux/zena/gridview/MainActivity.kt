package com.lux.zena.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lux.zena.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val recycler:RecyclerView by lazy { binding.recycler }
    var items = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        items.add(Item("apple",R.drawable.sample01))
        items.add(Item("banana",R.drawable.sample02))
        items.add(Item("cherry",R.drawable.sample03))
        items.add(Item("dalgona",R.drawable.sample04))
        items.add(Item("end",R.drawable.sample05))
        items.add(Item("fail",R.drawable.sample06))

        recycler.adapter = GridViewAdapter(this, items)
        recycler.layoutManager = GridLayoutManager(this,4, GridLayoutManager.VERTICAL, false)
    }

    override fun onResume() {
        super.onResume()

        recycler.adapter?.notifyDataSetChanged()
    }

}