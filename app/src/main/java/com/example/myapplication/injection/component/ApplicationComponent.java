package com.example.myapplication.injection.component;

import android.app.Application;
import android.content.Context;

import com.example.myapplication.App;
import com.example.myapplication.injection.ApplicationContext;
import com.example.myapplication.injection.module.ApplicationModule;
//import com.huatec.hiot_cloud.App;
//import com.huatec.hiot_cloud.injection.ApplicationContext;
//import com.huatec.hiot_cloud.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App application);

    @ApplicationContext
    Context context();

    Application application();


    @Component.Builder
    interface ApplicationModuleBuilder {
        ApplicationComponent build();

        ApplicationModuleBuilder applicationModule(ApplicationModule applicationModule);
    }
}
