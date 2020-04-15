package com.example.myapplication.test.mvptest;

import com.example.myapplication.test.mvptest.model.User;

public class TestPresenter  {

    private  TestView view;

    public TestPresenter(TestView view){
        this.view = view;
    }

    public void login(User user){
        if("znn".equals(user.getUserName()) && "123456".equals(user.getPassword())){
            view.showMessage("登陆成功");
        }else {
            view.showMessage("登陆失败");
        }
    }
}
