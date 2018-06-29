package com.test.dragger2.ui

import android.databinding.DataBindingComponent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.dragger2.R
import com.test.dragger2.databinding.ActivityDependenciesDragger2Binding
import com.test.dragger2.dragger2.dependencies.A
import com.test.dragger2.dragger2.dependencies.B
import com.test.dragger2.dragger2.dependencies.DaggerAComponent
import com.test.dragger2.dragger2.dependencies.DaggerBComponent
import com.test.dragger2.dragger2.module.Female
import com.test.dragger2.dragger2.module.Men
import com.test.dragger2.dragger2.module.ModuleA
import com.test.dragger2.dragger2.simple.Student
import javax.inject.Inject

class DependenciesDragger2Activity : AppCompatActivity() {
    var binding : ActivityDependenciesDragger2Binding? = null

    @Inject
    lateinit var student: Student

    @Inject
    lateinit var men : A

    @Inject
    lateinit var female : B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dependencies_dragger2)

        val aComponent = DaggerAComponent.builder().build()
        DaggerBComponent.builder().aComponent(aComponent).build().inject(this)

        binding?.name = "${student.name} ${men.name} ${female.name}"


    }
}
