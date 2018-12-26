package com.example.levivas.configuredapp.di.builder;

import com.example.levivas.configuredapp.ui.second.SecondActivity;
import com.example.levivas.configuredapp.ui.second.di.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity bindSecondActivity();
}
