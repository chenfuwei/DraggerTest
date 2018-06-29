package com.test.dragger2.dragger2.simple

import android.util.Log
import javax.inject.Inject


class Student @Inject constructor(){
    var name : String = "chenfuwei"

    @Inject
    lateinit var teacher : Teacher

    fun printName()
    {
        Log.i("Student", "student name = $name")
    }
}