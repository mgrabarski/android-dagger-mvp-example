package com.mateusz.grabarski.androidmvpdagger.base;

import android.app.Application;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class App extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = getApplicationComponent();
    }

    public ApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null)
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();

        return mApplicationComponent;
    }
}
