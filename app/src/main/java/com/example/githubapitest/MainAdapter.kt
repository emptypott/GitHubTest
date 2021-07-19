package com.example.ablyproject.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ablyproject.data.api.response.Banner
import com.example.ablyproject.databinding.ItemHomeBannerBinding
import com.example.githubapitest.databinding.ItemMain1Binding

/**
 * 배너 뷰페이져 어댑터. BannerVp2Adapter.
 */
class MainAdapter : RecyclerView.Adapter<MainAdapter.Main1ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Main1ViewHolder {
        return Main1ViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        // 무한 스크롤을 위해 FAKE 카운트 설정.
        return Int.MAX_VALUE
    }

    override fun onBindViewHolder(holder: Main1ViewHolder, position: Int) {

    }

    class Main1ViewHolder private constructor(private val binding : ItemMain1Binding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent : ViewGroup) : Main1ViewHolder {
                return Main1ViewHolder(binding)
            }
         }
    }

    fun bind(item : ProfileList) {

    }

}