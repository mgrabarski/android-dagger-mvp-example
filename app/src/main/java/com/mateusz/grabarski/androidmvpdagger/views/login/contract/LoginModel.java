package com.mateusz.grabarski.androidmvpdagger.views.login.contract;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;
import com.mateusz.grabarski.androidmvpdagger.data.repository.LoginRepository;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class LoginModel implements LoginContract.Model {

    private LoginRepository mLoginRepository;

    public LoginModel(LoginRepository mLoginRepository) {
        this.mLoginRepository = mLoginRepository;
    }

    @Override
    public void createUser(String firstName, String lastName) {
        mLoginRepository.saveUser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        return mLoginRepository.getUser();
    }
}
