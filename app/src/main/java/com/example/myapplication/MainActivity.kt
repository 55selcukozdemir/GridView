package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productList = arrayListOf<Product>(Product("selçuk"),Product("ahmet"),Product("nazlı"),Product("selin"))

        //Erişim sağlanılan kod
        var gridView =findViewById<GridView>(R.id.aGridView)
        gridView.adapter = PrudoctGridViewBaseAdapter(productList,this)

    }
}