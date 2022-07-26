package com.lux.zena.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.lux.zena.gridview.databinding.GridviewItemBinding

class GridViewAdapter(val context: Context, val img_list:Array<Int>, val text_list:Array<String>) : BaseAdapter(){



    val binding:GridviewItemBinding by lazy { GridviewItemBinding.inflate(LayoutInflater.from(context)) }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.gridview_item, null)
        var iv:ImageView = view.findViewById(R.id.grid_iv)
        var tv:TextView = view.findViewById(R.id.grid_tv)

        iv.setImageResource(img_list[0])
        tv.text = text_list[0]
        return view
    }
    override fun getCount(): Int {
        return img_list.size
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }


}