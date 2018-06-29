package com.test.dragger2.dragger2.dependencies

import dagger.Component

@Component(modules = arrayOf(AModule::class))
interface AComponent {
    //将A暴露出来供依赖的component使用
    fun a(): A
}