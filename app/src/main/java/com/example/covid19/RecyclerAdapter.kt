package com.example.covid19


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.datatableitem.view.*

class RecyclerAdapter(val context : Context) : RecyclerView.Adapter<ItemViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.datatableitem, parent, false))
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.dayValueTv.text = "dayValueTv"
        holder.countryValueTv.text ="countryValueTv"
        holder.totalCasesValueTv.text ="totalCasesValueTv"
        holder.totalDeathsValueTv.text ="totalDeathsValueTv"

    }
}

class ItemViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val dayValueTv = view.DayValueTv
    val countryValueTv = view.CountryValueTv
    val totalDeathsValueTv = view.TotalDeathsValueTv
    val totalCasesValueTv = view.TotalCasesValueTv
}