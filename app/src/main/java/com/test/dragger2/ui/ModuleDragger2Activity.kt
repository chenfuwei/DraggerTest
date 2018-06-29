package com.test.dragger2.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.test.dragger2.R
import com.test.dragger2.databinding.ActivityModuleDragger2Binding
import com.test.dragger2.dragger2.module.DaggerModuleAComponent
import com.test.dragger2.dragger2.module.Female
import com.test.dragger2.dragger2.module.Men
import com.test.dragger2.dragger2.module.ModuleA
import javax.inject.Inject

class ModuleDragger2Activity : AppCompatActivity() {
    var binding: ActivityModuleDragger2Binding? = null

    @Inject
    lateinit var men :Men

    @Inject
    lateinit var femal : Female

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view :View = LayoutInflater.from(this).inflate(R.layout.activity_module_dragger2, null)
        setContentView(view)

        binding = DataBindingUtil.bind(view)

        DaggerModuleAComponent.builder().moduleA(ModuleA("module test ok!")).build().inject(this)


        binding?.name = "${men.name} ${femal.name}"
    }
}
