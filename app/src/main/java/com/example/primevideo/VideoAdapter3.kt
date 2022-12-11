package com.exammple.amazonprimevideo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideo.MainActivity
import com.example.primevideo.Video
import com.example.primevideo.databinding.CardDesign3Binding
import com.example.primevideo.databinding.CardDesignBinding

class VideoAdapter3(var mContext: MainActivity, var videoList: List<Video>):
    RecyclerView.Adapter<VideoAdapter3.CardDesign3Holder>(){
    inner class CardDesign3Holder(var binding: CardDesign3Binding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign3Holder {
        val binding = CardDesign3Binding.inflate(LayoutInflater.from(mContext as Context), parent, false)
        return CardDesign3Holder(binding)
    }

    override fun onBindViewHolder(holder: CardDesign3Holder, position: Int) {
        val video = videoList.get(position)
        val b = holder.binding

        b.imageView5.setImageResource(mContext.resources.getIdentifier(video.image, "drawable", (mContext as Context).packageName))
    }

    override fun getItemCount(): Int {
        return videoList.size
    }


}