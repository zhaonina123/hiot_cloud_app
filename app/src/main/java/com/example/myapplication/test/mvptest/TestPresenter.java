package com.example.myapplication.test.mvptest;

import com.example.myapplication.test.dagger2test.ThirdObj;
import com.example.myapplication.test.mvptest.model.User;
import com.example.myapplication.ui.base.BasePresenter;

import javax.inject.Inject;

public class TestPresenter extends BasePresenter<TestView> {

    @Inject
    ThirdObj thirdObj;

    @Inject
    public TestPresenter(){
    }



    public void login(User user){
        thirdObj.thirdAction();
        if("znn".equals(user.getUserName()) && "123456".equals(user.getPassword())){
            getView().showMessage("登陆成功");
        }else {
            getView().showMessage("登陆失败");
        }
    }
}
