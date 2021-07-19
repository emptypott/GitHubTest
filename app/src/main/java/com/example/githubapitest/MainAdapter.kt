package com.example.ablyproject.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubapitest.Profile
import com.example.githubapitest.databinding.ItemMain1Binding

/**
 * 배너 뷰페이져 어댑터. BannerVp2Adapter.
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.Main1ViewHolder>() {

    var userList : MutableList<Profile> = mutableListOf()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Main1ViewHolder {
        return Main1ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: Main1ViewHolder, position: Int) {

    }

    class Main1ViewHolder private constructor(private val binding : ItemMain1Binding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent : ViewGroup) : Main1ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMain1Binding.inflate(layoutInflater, parent, false)
                return Main1ViewHolder(binding)
            }
         }
    }

    fun bind(item : Profile) {

    }

}