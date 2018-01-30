package com.mateusz.grabarski.androidmvpdagger.base;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */
@Module
public class ApplicationModule {

    private App mApp;

    public ApplicationModule(App app) {
        this.mApp = app;
    }

    @Provides
    @Singleton
    App provideApplication() {
        return mApp;
    }
}
