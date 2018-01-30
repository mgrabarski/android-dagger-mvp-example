package com.mateusz.grabarski.androidmvpdagger.base;

import com.mateusz.grabarski.androidmvpdagger.MainActivity;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    void inject(MainActivity target);
}
