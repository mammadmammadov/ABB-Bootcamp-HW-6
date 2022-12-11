package com.example.primevideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.exammple.amazonprimevideo.*
import com.example.primevideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var videoList = ArrayList<Video>()
        var v1 = Video("mammals")
        val v2 = Video("hate_wedding")
        val v3 = Video("flight_risk")
        val v4 = Video("the_wilds")
        videoList.add(v1)
        videoList.add(v2)
        videoList.add(v3)
        videoList.add(v4)

        var videoList2 = ArrayList<Video>()
        var y1 = Video("og_mammal")
        val y2 = Video("og_boys")
        val y3 = Video("og_hate_wedding")
        val y4 = Video("og_rop")
        videoList2.add(y1)
        videoList2.add(y3)
        videoList2.add(y2)
        videoList2.add(y4)

        var videoList3 = ArrayList<Video>()
        var z1 = Video("psi")
        val z2 = Video("the_upside")
        val z3 = Video("the_wilds")
        val z4 = Video("flight_risk")
        videoList3.add(z1)
        videoList3.add(z2)
        videoList3.add(z3)
        videoList3.add(z4)



        val adapter = VideoAdapter(this, videoList)
        val adapter2 = VideoAdapter2(this, videoList2)
        val adapter3 = VideoAdapter3(this, videoList3)

        binding.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv.adapter = adapter

        binding.rv2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv2.adapter = adapter2

        binding.rv3.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        binding.rv3.adapter = adapter3
    }
}