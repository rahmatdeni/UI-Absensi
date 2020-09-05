package com.example.absensiptik.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.absensiptik.R
import com.example.absensiptik.data.entity.Course

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    private lateinit var dataList: List<Course>

    fun setData(data: List<Course>) {
        dataList = data
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_course, parent, false))
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(course: Course) {

        }
    }

}