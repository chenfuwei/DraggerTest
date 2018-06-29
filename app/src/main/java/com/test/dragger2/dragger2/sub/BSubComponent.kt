package com.test.dragger2.dragger2.sub

import com.test.dragger2.dragger2.dependencies.BModule
import com.test.dragger2.ui.DependenciesDragger2Activity
import com.test.dragger2.ui.SubDragger2Activity
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(BModule::class))
interface BSubComponent {
    fun inject(activity: SubDragger2Activity)
}