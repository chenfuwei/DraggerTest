package com.test.dragger2.dragger2.dependencies

import dagger.Module
import dagger.Provides

@Module
class AModule {

    @Provides
    fun getA(): A = A()
}