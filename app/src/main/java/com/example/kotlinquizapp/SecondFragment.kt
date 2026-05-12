/*
=====================================================
 PROJECT: Kotlin Quiz App
 FILE: SecondFragment.kt

 DESCRIPTION:
 This fragment serves as the second screen
 in the application's navigation flow.

 FEATURES:
 - Inflates fragment layout
 - Handles button click events
 - Navigates back to FirstFragment
 - Uses Android Navigation Component

 NOTES:
 - Extends Fragment class
 - Demonstrates fragment navigation handling
=====================================================
*/


package com.example.kotlinquizapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/*-- SECOND FRAGMENT CLASS --*/
class SecondFragment : Fragment() 
{

    /*-- CREATE FRAGMENT VIEW --*/
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? 
    {
        // Inflate fragment layout XML
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

     /*-- VIEW CREATED EVENT --*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) 
    {
        super.onViewCreated(view, savedInstanceState)

        // Set click listener for navigation button
        view.findViewById<Button>(R.id.button_second).setOnClickListener 
        {
            // Navigate back to FirstFragment
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}
