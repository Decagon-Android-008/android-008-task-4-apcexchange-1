package com.example.birthdaydates

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager: ViewPager2 = findViewById(R.id.viewPager)
        val myThings2 = mutableListOf(
            ToViewPager(R.drawable.import_pics,"Its Victor's Birthday"),
            ToViewPager(R.drawable.new_pics1,"Its Peter's Birthday"),
            ToViewPager(R.drawable.new_pics2,"Its Abbas's Birthday"),
            ToViewPager(R.drawable.new_pics3,"Its Kufre's Birthday"),
            ToViewPager(R.drawable.new_pics4,"Its Tochuckwu's Birthday"),
            ToViewPager(R.drawable.new_pics5,"Its Seun's Birthday"),
            ToViewPager(R.drawable.new_pics6,"Its Okezi's Birthday"),
            ToViewPager(R.drawable.new_pics7,"Its Tolu's Birthday"),
            ToViewPager(R.drawable.new_pics8,"Its Godday's Birthday"),
            ToViewPager(R.drawable.new_pics9,"Its Samuel's Birthday"),
            ToViewPager(R.drawable.new_pics10,"Its Micheal's Birthday"),
        )

        val adapter = ViewPagerAdapter(myThings2)
        viewpager.adapter = adapter


        viewpager.clipToPadding=false
        viewpager.clipChildren=false
        viewpager.offscreenPageLimit=3

        viewpager.setPadding(50, 0, 200, 0)


        val compoTrans = CompositePageTransformer()
        compoTrans.addTransformer{ page, position ->
            val r:Float = 1 - abs(position)
            page.translationX = 60f
            page.scaleY= 0.85f + r*0.15f
        }
        viewpager.setPageTransformer(compoTrans)
        val recycler: RecyclerView  = findViewById(R.id.recycle_holder)

        val myThings = mutableListOf(
    ToRecycler(R.drawable.vector__1_,"Peter Android",R.drawable.purple),
    ToRecycler(R.drawable.vector__2_,"Abbas Android",R.drawable.orange),
    ToRecycler(R.drawable.vector__3_,"Kufre Android",R.drawable.indigo),
    ToRecycler(R.drawable.vector__4_,"John Android",R.drawable.green)
)
        val adapter1 = RecyclerViewAdapter(myThings)
        recycler.adapter = adapter1
        recycler.layoutManager=LinearLayoutManager(this)
    }
}
