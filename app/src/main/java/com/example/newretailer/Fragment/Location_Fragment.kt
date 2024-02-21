package com.example.newretailer.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newretailer.Adpter.Location_Adpter
import com.example.newretailer.Adpter.Nearby_Adpter
import com.example.newretailer.Adpter.Saved_Adpter
import com.example.newretailer.R

class Location_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_location_, container, false)



        val data = ArrayList<String>()

        for(item in 1..10){
            data.add("")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycler_Address)
        val adapter= Saved_Adpter(data)
        recyclerview.adapter=adapter


        val data1 = ArrayList<String>()

        for(item in 1..10){
            data1.add("")
        }

        val recyclerview1 = view.findViewById<RecyclerView>(R.id.recycler_location)
        val adapter1= Location_Adpter(data1)
        recyclerview1.adapter=adapter1

        val data2 = ArrayList<String>()

        for(item in 1..10){
            data2.add("")
        }

        val recyclerview2 = view.findViewById<RecyclerView>(R.id.recycler_nearby_stores)
        val adapter2= Nearby_Adpter(data2)
        recyclerview2.adapter=adapter2





        return view
    }


}