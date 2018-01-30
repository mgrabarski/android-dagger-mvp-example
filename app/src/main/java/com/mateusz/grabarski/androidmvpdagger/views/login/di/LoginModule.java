package com.mateusz.grabarski.androidmvpdagger.views.login.di;

import com.mateusz.grabarski.androidmvpdagger.data.managers.memory.LoginManagerInMemory;
import com.mateusz.grabarski.androidmvpdagger.data.repository.LoginRepository;
import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginContract;
import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginModel;
import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */
@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter provideLoginPresenter(LoginContract.Model model) {
        return new LoginPresenter(model);
    }

    @Provides
    public LoginContract.Model provideLoginModel(LoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository() {
        return new LoginManagerInMemory();
    }
}
