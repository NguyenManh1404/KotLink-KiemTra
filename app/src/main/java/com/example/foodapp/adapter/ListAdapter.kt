package com.example.foodapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R

import com.example.foodapp.model.Food
import com.example.foodapp.uitel.loadImage


class ListAdapter (var mContext: Context, var foodList:List<Food>):
RecyclerView.Adapter<ListAdapter.ListViewHoldel>()
{
    inner  class ListViewHoldel(var v:View): RecyclerView.ViewHolder(v){
        var imgF = v.findViewById<ImageView>(R.id.foodImageView)
        var nameF = v.findViewById<TextView>(R.id.nameTextView)
        var descriF = v.findViewById<TextView>(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHoldel {
     var infalter =LayoutInflater.from(parent.context)
        var  v=infalter.inflate(R.layout.row_item,parent,false)
        return ListViewHoldel(v)
    }

    override fun onBindViewHolder(holder: ListViewHoldel, position: Int) {
        var newList = foodList[position]
        holder.nameF.text = newList.name
        holder.descriF.text = newList.description
        holder.imgF.loadImage(newList.imageUrl)
        holder.v.setOnClickListener {

        }
    }

    override fun getItemCount(): Int = foodList.size
}