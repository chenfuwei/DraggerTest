package com.test.dragger2.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.dragger2.R
import com.test.dragger2.databinding.ActivitySubDragger2Binding
import com.test.dragger2.dragger2.dependencies.A
import com.test.dragger2.dragger2.dependencies.B
import com.test.dragger2.dragger2.dependencies.BModule
import com.test.dragger2.dragger2.sub.DaggerAParentComponent
import javax.inject.Inject

class SubDragger2Activity : AppCompatActivity() {
    lateinit var binding: ActivitySubDragger2Binding

    @Inject
    lateinit var a : A

    @Inject
    lateinit var b: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sub_dragger2)

        val aParentComponent = DaggerAParentComponent.builder().build()
        aParentComponent.addSub(BModule()).inject(this)

        binding.name = "${a.name} ${b.name}"
    }
}
