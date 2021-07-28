package com.example.birthdaydates

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val stuff: List<ToRecycler>):RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val myPhotos: ImageView = itemView.findViewById(R.id.people_picture)
        val names: TextView = itemView.findViewById(R.id.people_name)
        val col: View = itemView.findViewById(R.id.scroll_bar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view1 = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle, parent, false)
        return RecyclerViewHolder(view1)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.apply {
            names.text = stuff[position].people
            myPhotos.setImageResource(stuff[position].photos)
            col.setBackgroundResource(stuff[position].bar)
        }
    }

        override fun getItemCount(): Int {
            return stuff.size
        }


    }