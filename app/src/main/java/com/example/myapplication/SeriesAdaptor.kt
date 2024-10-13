package com.example.myapplication
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coderobust.recyclerview.SeriesViewHolder

class SeriesAdaptor(private val series: ArrayList<Series>):RecyclerView.Adapter<SeriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val view: View =LayoutInflater.from(parent.context)
            .inflate(R.layout.series_holder,parent,false)
        return SeriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return series.size
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        val series= series[position]
        holder.title.text=series.title
        holder.image.setImageResource(series.image)
        holder.rating.text=series.ratting

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, Details::class.java)
            intent.putExtra("title",series.title )
            intent.putExtra("image", series.image)
            intent.putExtra("rating", series.ratting)
            intent.putExtra("des", series.description)
            holder.itemView.context.startActivity(intent)
        }
    }

}
