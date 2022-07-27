package com.lux.zena.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lux.zena.gridview.databinding.GridviewItemBinding


class GridViewAdapter(val context: Context, var items:MutableList<Item>) : RecyclerView.Adapter<GridViewAdapter.VH>(){

    inner class VH(itemView:View) : RecyclerView.ViewHolder(itemView){
        val tv:TextView by lazy { itemView.findViewById(R.id.grid_tv) }
        val iv:ImageView by lazy { itemView.findViewById(R.id.grid_iv) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater:LayoutInflater = LayoutInflater.from(context)
        val itemView:View = inflater.inflate(R.layout.gridview_item, parent,false)
        return VH(itemView)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.tv.text = item.txt
        holder.iv.setImageResource(item.img)


    }

    override fun getItemCount(): Int = items.size

}