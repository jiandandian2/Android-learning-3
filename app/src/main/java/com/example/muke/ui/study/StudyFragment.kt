package com.example.muke.ui.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muke.R
import kotlinx.android.synthetic.main.fragment_study.*
import kotlinx.android.synthetic.main.item_fragment_study.*
import kotlinx.android.synthetic.main.item_fragment_study.view.*


class StudyFragment: Fragment(R.layout.fragment_study) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.adapter = StudyAdapter()

    }

    inner class StudyAdapter : RecyclerView.Adapter<StudyAdapter.StudyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudyViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.fragment_study, parent, false)
            return StudyViewHolder(view)
        }

        override fun onBindViewHolder(holder: StudyViewHolder, position: Int) {
            holder.itemView.item_course_pic.setImageResource(R.drawable.pic2)
            holder.itemView.item_course_title.text = "【${position}】2021Android从零入门到实战(Kotlin版)"
            holder.itemView.item_course_lable.text = "免费课"
            holder.itemView.item_course_progress.text = "已学50%"
        }

        override fun getItemCount(): Int {
            return 20
        }

        inner class StudyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        }

    }
}

