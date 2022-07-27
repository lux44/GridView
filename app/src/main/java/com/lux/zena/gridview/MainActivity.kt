package com.lux.zena.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.zena.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var items : MutableList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)



        var img = arrayOf(
            R.drawable.sample01,
            R.drawable.sample02,
            R.drawable.sample03,
            R.drawable.sample04,
            R.drawable.sample05,
            R.drawable.sample06
        )
        var txt = arrayOf(
            "apple",
            "banana",
            "candy",
            "danger",
            "end",
            "file"
        )

        //val gridViewAdapter = GridViewAdapter(this, img,txt)

    }
}