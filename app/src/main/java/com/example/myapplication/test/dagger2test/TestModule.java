package com.example.myapplication.test.dagger2test;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    public ThirdObj getThirdObj(){
        return new ThirdObj();
    }
}
