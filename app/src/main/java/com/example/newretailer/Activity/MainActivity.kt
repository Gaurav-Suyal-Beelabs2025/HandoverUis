package com.example.newretailer.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newretailer.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = findNavController(R.id.activity_main_nav_host_fragment1)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_botton)
        bottomNavigationView.setupWithNavController(navController)


        navController.addOnDestinationChangedListener { _, destination, _ ->

            if (destination.id == R.id.homeFragment) {
                bottomNavigationView.visibility = View.GONE

                if (destination.id == R.id.home_fragment) {
                    bottomNavigationView.visibility = View.GONE

                    if (destination.id == R.id.pickup_Location_Fragment) {
                        bottomNavigationView.visibility = View.GONE

                        if (destination.id == R.id.location_Fragment) {
                            bottomNavigationView.visibility = View.GONE

                    } else {

                        bottomNavigationView.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
}
}