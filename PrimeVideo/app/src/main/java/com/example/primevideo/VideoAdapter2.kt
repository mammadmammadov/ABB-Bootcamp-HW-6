package com.exammple.amazonprimevideo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideo.MainActivity
import com.example.primevideo.Video
import com.example.primevideo.databinding.CardDesign2Binding
import com.example.primevideo.databinding.CardDesignBinding

class VideoAdapter2(var mContext: MainActivity, var videoList: List<Video>):
    RecyclerView.Adapter<VideoAdapter2.CardDesign2Holder>(){
    inner class CardDesign2Holder(var binding: CardDesign2Binding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign2Holder {
        val binding = CardDesign2Binding.inflate(LayoutInflater.from(mContext as Context), parent, false)
        return CardDesign2Holder(binding)
    }

    override fun onBindViewHolder(holder: CardDesign2Holder, position: Int) {
        val video = videoList.get(position)
        val b = holder.binding

        b.imageViewOg.setImageResource(mContext.resources.getIdentifier(video.image, "drawable", (mContext as Context).packageName))
    }

    override fun getItemCount(): Int {
        return videoList.size
    }


}