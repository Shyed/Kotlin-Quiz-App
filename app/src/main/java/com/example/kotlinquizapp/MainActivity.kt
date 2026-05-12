/*
=====================================================
 PROJECT: Kotlin Quiz App
 FILE: MainActivity.kt

 DESCRIPTION:
 This activity serves as the main entry point
 for the Android application.

 FEATURES:
 - Toolbar setup
 - Floating Action Button (FAB)
 - Snackbar message display
 - Options menu handling
 - Action bar integration

 NOTES:
 - Extends AppCompatActivity
 - Uses Kotlin Android synthetic properties
 - Demonstrates basic Android UI interaction
=====================================================
*/

package com.example.kotlinquizapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

/*-- MAIN ACTIVITY CLASS --*/
class MainActivity : AppCompatActivity() 
{
    /*-- ACTIVITY CREATION --*/
    override fun onCreate(savedInstanceState: Bundle?) 
    {
        super.onCreate(savedInstanceState)

        // Load activity layout
        setContentView(R.layout.activity_main)

        // Set toolbar as action bar
        setSupportActionBar(toolbar)

        /*-- FLOATING ACTION BUTTON EVENT --*/
        fab.setOnClickListener 
        { view ->
             // Display temporary Snackbar message
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    /*-- CREATE OPTIONS MENU --*/
    override fun onCreateOptionsMenu(menu: Menu): Boolean 
    {
        // Inflate menu layout into action bar
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean 
    {
        // Handle selected menu items
        return when (item.itemId) {

            // Settings menu option
            R.id.action_settings -> true

            // Default behavior
            else -> super.onOptionsItemSelected(item)
        }
    }
}
