package com.mateusz.grabarski.androidmvpdagger.views.login.di;

import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginContract;
import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */
@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter loginPresenter() {
        return new LoginPresenter();
    }
}
