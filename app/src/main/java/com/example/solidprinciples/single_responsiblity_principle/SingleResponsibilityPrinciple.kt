package com.example.solidprinciples.single_responsiblity_principle

import android.util.Log

/*
 * SingleResponsibilityPrinciple :
 * A Class should have only one reason to change . Each class should handle one responsibility only.
 *
 * "Single job" means all the functions inside a class or object should do related work.


 *
 */

class StringValidator{

    fun isValidString(input : String) : Boolean{
        return input.isNotBlank()
    }

    fun lengthChecking(input : String) : Boolean {
        return input.length > 5
    }
}