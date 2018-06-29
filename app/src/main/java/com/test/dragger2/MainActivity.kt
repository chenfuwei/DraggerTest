package com.test.dragger2

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.test.dragger2.databinding.ActivityMainBinding
import com.test.dragger2.dragger2.module.DaggerModuleAComponent
import com.test.dragger2.dragger2.module.Female
import com.test.dragger2.dragger2.module.Men
import com.test.dragger2.dragger2.module.ModuleA
import com.test.dragger2.dragger2.simple.DaggerStudentComponent
import com.test.dragger2.dragger2.simple.Student
import com.test.dragger2.dragger2.simple.StudentComponent
import com.test.dragger2.ui.DependenciesDragger2Activity
import com.test.dragger2.ui.ModuleDragger2Activity
import com.test.dragger2.ui.SimpleDragger2Activity
import com.test.dragger2.ui.SubDragger2Activity
import javax.inject.Inject

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    var activityMainBinding: ActivityMainBinding? = null

//    @Inject
//   lateinit var student :Student
//
//    @Inject
//    lateinit var men :Men
//
//    @Inject
//    lateinit var female : Female


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        DaggerStudentComponent.builder().build().inject(this)

//        val daggerStudentComponent = DaggerStudentComponent.builder().build()
//        DaggerModuleAComponent.builder().studentComponent(daggerStudentComponent).moduleA(ModuleA("fuweichen")).build().inject(this)
//        Log.i(TAG, "student name = ${student.name} teacher name = ${student.teacher.name}")
//
//        student.printName()
//
//
//
//        Log.i(TAG, " men name = ${men.name} female name = ${female.name}")


        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding?.simple?.setOnClickListener { startActivity(Intent(this@MainActivity, SimpleDragger2Activity::class.java)) }
        activityMainBinding?.module?.setOnClickListener { startActivity(Intent(this@MainActivity, ModuleDragger2Activity::class.java)) }
        activityMainBinding?.dependencies?.setOnClickListener{startActivity(Intent(this@MainActivity, DependenciesDragger2Activity::class.java))}
        activityMainBinding?.sub?.setOnClickListener{startActivity(Intent(this@MainActivity, SubDragger2Activity::class.java))}
    }
}
