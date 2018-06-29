package com.test.dragger2.dragger2.dependencies

import dagger.Module
import dagger.Provides

@Module
class BModule {

    @Provides
    fun getB(): B = B()
}