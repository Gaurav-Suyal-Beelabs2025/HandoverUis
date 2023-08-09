package com.example.newretailer.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.newretailer.R
import com.google.android.material.bottomsheet.BottomSheetDialog


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)


        val location= view.findViewById<Button>(R.id.button_Location)
        val menuadd= view.findViewById<Button>(R.id.button_menu)
        val alertdialogbox= view.findViewById<Button>(R.id.button_Alert_dialogbox)
        val multipleorder= view.findViewById<Button>(R.id.button_multiple_order)
        val orderlist= view.findViewById<Button>(R.id.button_order_list)
        val addmenu= view.findViewById<Button>(R.id.button_Add_menu)
        val newadd= view.findViewById<Button>(R.id.button_new_add)
        val pickuplocation= view.findViewById<Button>(R.id.button_pickuplocation)
        val exact= view.findViewById<Button>(R.id.button_exact)

        location.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.location_Fragment)
        }


        menuadd.setOnClickListener {


            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.menu_add, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

        }

        alertdialogbox.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.alert_dialiogbox_Fragment)
        }

        multipleorder.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.multiple_Order_Fragment)

        }

        orderlist.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.order_listFragment)

        }


        addmenu.setOnClickListener {
            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.add_menu, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

        }


        newadd.setOnClickListener {
            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.new_add, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

        }

        exact.setOnClickListener {

            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.exact_address, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()

        }

        pickuplocation.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.pickup_Location_Fragment)

        }


        return view
    }


}