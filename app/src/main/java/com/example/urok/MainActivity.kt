package com.example.urok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val rv: RecyclerView = findViewById(R.id.my_rececleview)
        rv.adapter = Adapter(getList())


d
    }
fun getList():ArrayList<Myclass>{
    val rr = findViewById<EditText>(R.id.e)
    val ew = findViewById<EditText>(R.id.w)
    val btn = findViewById<Button>(R.id.q)

    val list = ArrayList<Myclass>()
    btn.setOnClickListener {
        list.add(Myclass("", rr.text.toString(), ""))
    }





return list
}



}