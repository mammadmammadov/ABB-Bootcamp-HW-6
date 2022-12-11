package com.exammple.amazonprimevideo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideo.MainActivity
import com.example.primevideo.Video
import com.example.primevideo.databinding.CardDesignBinding

class VideoAdapter(var mContext: MainActivity, var videoList: List<Video>):
    RecyclerView.Adapter<VideoAdapter.CardDesignHolder>(){
    inner class CardDesignHolder(var binding: CardDesignBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext as Context), parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val video = videoList.get(position)
        val b = holder.binding

        b.imageViewMovie.setImageResource(mContext.resources.getIdentifier(video.image, "drawable", (mContext as Context).packageName))
    }

    override fun getItemCount(): Int {
        return videoList.size
    }


}