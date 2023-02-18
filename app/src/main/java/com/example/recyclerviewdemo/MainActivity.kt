package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    var listTheCategories = arrayListOf<phonelist>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       listTheCategories =ArrayList<phonelist>()
        listTheCategories.add(phonelist("Navy Rajput" ,"8888888860"))
        listTheCategories.add(phonelist("Navy Rajput" ,"8888888860"))
        listTheCategories.add(phonelist("Navy Rajput" ,"8888888860"))
        listTheCategories.add(phonelist("Navy Rajput" ,"8888888860"))
        listTheCategories.add(phonelist("Navy Rajput" ,"8888888860"))


        binding.rcv.layoutManager =LinearLayoutManager(this,LinearLayoutManager.VERTICAL ,false)

        binding.rcv.adapter = rcvAdapter(this,listTheCategories)



    }

}