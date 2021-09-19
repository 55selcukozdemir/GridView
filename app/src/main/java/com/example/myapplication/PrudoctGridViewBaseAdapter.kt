package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PrudoctGridViewBaseAdapter: BaseAdapter  {

    var nameList = ArrayList<Product>()
    var contex: Context? = null

    constructor(nameList: ArrayList<Product>, contex: Context?) : super() {
        this.nameList = nameList
        this.contex = contex
    }


    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any {
        return nameList[p0]
    }

    override fun getItemId(p0: Int): Long {
            return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var i = contex!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var productXml = i.inflate(R.layout.product,p2,false)
        productXml.findViewById<TextView>(R.id.textView).text = nameList[p0].name
        return productXml
    }


}