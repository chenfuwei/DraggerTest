package com.test.dragger2.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.dragger2.R
import com.test.dragger2.databinding.ActivitySimpleDragger2Binding
import com.test.dragger2.dragger2.simple.DaggerStudentComponent
import com.test.dragger2.dragger2.simple.Student
import javax.inject.Inject

class SimpleDragger2Activity : AppCompatActivity() {
    @Inject
    lateinit var student: Student
    var binding : ActivitySimpleDragger2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_dragger2)

        DaggerStudentComponent.builder().build().inject(this)

        student.name = "simple test ok!"
        binding?.name = student.name

    }
}
