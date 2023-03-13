package com.example.urok

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val array:ArrayList<Myclass>):RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(item : View):RecyclerView.ViewHolder(item){
        val image:ImageView = item.findViewById(R.id.image)
        val name: TextView = item.findViewById(R.id.name)
        val surName: TextView = item.findViewById(R.id.surname)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.itemview, parent, false)
        return MyViewHolder(myViewHolder)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = array[position].name
        holder.surName.text = array[position].suname
    }

    override fun getItemCount(): Int {
        return array.size

    }
}