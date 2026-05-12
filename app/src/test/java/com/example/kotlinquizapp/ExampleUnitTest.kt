/*
=====================================================
 PROJECT: Kotlin Quiz App
 FILE: ExampleUnitTest.kt

 DESCRIPTION:
 This file contains a simple local unit test
 for validating application logic.

 FEATURES:
 - Basic mathematical assertion testing
 - JUnit test integration
 - Local JVM execution

 NOTES:
 - Runs on the development machine
 - Does not require Android device or emulator
 - Demonstrates basic unit testing structure
=====================================================
*/

package com.example.kotlinquizapp

import org.junit.Test

import org.junit.Assert.*

/*-- UNIT TEST CLASS --*/
class ExampleUnitTest 
{
    @Test
    /*-- ADDITION TEST --*/
    fun addition_isCorrect() 
    {
        // Verify that 2 + 2 equals 4
        assertEquals(4, 2 + 2)
    }
}
