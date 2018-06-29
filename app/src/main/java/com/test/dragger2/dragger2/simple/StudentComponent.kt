package com.test.dragger2.dragger2.simple

import com.test.dragger2.MainActivity
import com.test.dragger2.ui.SimpleDragger2Activity
import dagger.Component

@Component()
interface StudentComponent {
    fun inject(activity: SimpleDragger2Activity)
}