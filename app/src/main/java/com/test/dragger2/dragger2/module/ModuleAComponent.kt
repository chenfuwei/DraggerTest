package com.test.dragger2.dragger2.module

import com.test.dragger2.MainActivity
import com.test.dragger2.dragger2.simple.StudentComponent
import com.test.dragger2.ui.ModuleDragger2Activity
import dagger.Component


@Component(modules = arrayOf(ModuleA::class))
interface ModuleAComponent {
    fun inject(activity: ModuleDragger2Activity)
}