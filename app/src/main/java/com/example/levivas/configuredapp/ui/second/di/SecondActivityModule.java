package com.example.levivas.configuredapp.ui.second.di;

import com.example.levivas.configuredapp.ui.second.viewmodel.SecondViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {
    @Provides
    SecondViewModel secondViewModel() {
        return new SecondViewModel();
    }
}
