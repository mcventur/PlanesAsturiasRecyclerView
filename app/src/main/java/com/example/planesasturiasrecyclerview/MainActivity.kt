package com.example.planesasturiasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecyclerview.adapter.PlanesRecyclerAdapter
import com.example.planesasturiasrecyclerview.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvPlanes:RecyclerView = findViewById(R.id.planesRecyclerView)
        val dataSet = DataSource.listaPlanes
        rvPlanes.adapter = PlanesRecyclerAdapter(dataSet)
    }
}