package com.test.dragger2.dragger2.sub

import com.test.dragger2.dragger2.dependencies.AModule
import com.test.dragger2.dragger2.dependencies.BModule
import dagger.Component

@Component(modules =  arrayOf(AModule::class))
interface AParentComponent {
    fun addSub(bModule: BModule): BSubComponent
}