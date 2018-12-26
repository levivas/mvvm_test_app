package com.example.levivas.configuredapp.di.component;

import android.app.Application;

import com.example.levivas.configuredapp.ConfiguredApp;
import com.example.levivas.configuredapp.di.builder.ActivityBuilder;
import com.example.levivas.configuredapp.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class
})
public interface AppComponent {

    void inject(ConfiguredApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}