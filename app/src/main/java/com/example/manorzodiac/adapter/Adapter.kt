package com.example.manorzodiac.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manorzodiac.database.Zodiac
import com.example.manorzodiac.ZodiacInfo
import com.example.zodiac1.R


class Adapter(private val context: Context,
              private val dataset: List<Zodiac>)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.sign)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = item.name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, ZodiacInfo::class.java)
            intent.putExtra("zodiac_name", item.name)
            intent.putExtra("zodiac_description", item.description)
            intent.putExtra("zodiac_symbol", item.symbol)
            intent.putExtra("zodiac_month", item.month)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }


}