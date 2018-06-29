package com.test.dragger2.dragger2.module

import dagger.Module
import dagger.Provides

@Module
class ModuleA {
    var name = "chenfuwei"

    constructor(name: String)
    {
        this.name = name
    }
    @Provides
    fun getMen() : Men
    {
       return  Men()
    }

    @Provides
    fun getFemale(): Female
    {
        return Female(name)
    }
}