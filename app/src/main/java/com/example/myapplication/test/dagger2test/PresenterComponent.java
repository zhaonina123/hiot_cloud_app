package com.example.myapplication.test.dagger2test;


import com.example.myapplication.test.mvptest.TestMVPActivity;

import dagger.Component;

@Component(modules = TestModule.class)
public interface PresenterComponent {
    void inject(TestMVPActivity testMVPActivity);
}
