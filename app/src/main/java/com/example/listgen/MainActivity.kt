package com.example.listgen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var buttonAdd: FloatingActionButton;
    private val itemList = mutableListOf<String>()
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        buttonAdd = findViewById(R.id.buttonAdd)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemList)
        listView.adapter = adapter

        buttonAdd.setOnClickListener {
            val newItem = "novo item ${adapter.count + 1}"
            adapter.add(newItem)
            adapter.notifyDataSetChanged()
        }
    }
}