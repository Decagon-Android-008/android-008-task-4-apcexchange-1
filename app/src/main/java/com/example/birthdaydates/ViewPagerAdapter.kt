package com.example.birthdaydates

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class ViewPagerAdapter(val newStuff: List<ToViewPager>):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val itemImages: ImageView = itemView.findViewById(R.id.image1)
        val itemTitle: TextView = itemView.findViewById(R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.apply {
            itemTitle.text = newStuff[position].date
            itemImages.setImageResource(newStuff[position].img)
        }
    }

    override fun getItemCount(): Int {
        return newStuff.size
    }
}