package com.coderobust.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class SeriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image:ImageView=itemView.findViewById(R.id.image)
    val title:TextView=itemView.findViewById(R.id.title)
    val rating:TextView=itemView.findViewById(R.id.rating)
}