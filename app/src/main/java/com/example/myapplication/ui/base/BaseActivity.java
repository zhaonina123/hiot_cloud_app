package com.example.myapplication.ui.base;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.App;
import com.example.myapplication.injection.component.ActivityComponent;
import com.example.myapplication.injection.component.ApplicationComponent;
import com.example.myapplication.injection.component.DaggerActivityComponent;
import com.example.myapplication.injection.module.ActivityModule;

public abstract class BaseActivity<V extends BaseView, P extends BasePresenter<V>> extends AppCompatActivity implements BaseView {
    private P presenter;

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectIndependies();
        presenter = createPresenter();
        if (presenter != null) {
            presenter.setView((V) this);
        }
    }
    public abstract P createPresenter();

    public abstract void injectIndependies();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    public ActivityComponent getActivityComponent() {
        if (null == mActivityComponent) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(getActivityModule())
                    .applicationComponent(getApplicationComponent())
                    .build();
        }
        return mActivityComponent;
    }

    public ApplicationComponent getApplicationComponent() {

        Application application = getApplication();
        App app = (App) application;
        return app.component();
    }

    /**
     * Get an Activity module for dependency injection.
     */
    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }
}

