package com.mateusz.grabarski.androidmvpdagger.views.login.di;

import com.mateusz.grabarski.androidmvpdagger.views.login.LoginActivity;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
