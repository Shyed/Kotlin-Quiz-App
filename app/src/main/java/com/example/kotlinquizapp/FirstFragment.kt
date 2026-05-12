/*
=====================================================
 PROJECT: Kotlin Quiz App
 FILE: FirstFragment.kt

 DESCRIPTION:
 This fragment serves as the first screen
 in the application navigation flow.

 FEATURES:
 - Inflates fragment layout
 - Handles button click events
 - Navigates to SecondFragment
 - Uses Android Navigation Component

 NOTES:
 - Extends Fragment class
 - Designed for beginner Android development practice
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

/*-- FIRST FRAGMENT CLASS --*/
class FirstFragment : Fragment() {

    /*-- CREATE FRAGMENT VIEW --*/
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate fragment layout XML
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    /*-- VIEW CREATED EVENT --*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set click listener for navigation button
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            // Navigate to SecondFragment
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
