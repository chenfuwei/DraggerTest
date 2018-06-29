package com.test.dragger2.dragger2.dependencies

import com.test.dragger2.ui.DependenciesDragger2Activity
import dagger.Component

@Component(dependencies = arrayOf(AComponent::class), modules = arrayOf(BModule::class))
interface BComponent {
    fun inject(activity: DependenciesDragger2Activity)
}