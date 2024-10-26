package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val taskList = arrayListOf<String>()
        taskList.add("Wake Up! Mr. Ayush Kumar")
        taskList.add("Have a Morning Routine")
        taskList.add("Complete the App Development Projects")
        taskList.add("Work on Resume!")
        taskList.add("Improve Your Social Network!")
        taskList.add("Attend Exam")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}