package com.mateusz.grabarski.androidmvpdagger.views.login.contract;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class LoginModel implements LoginContract.Model {
    @Override
    public void createUser(String firstName, String lastName) {

    }

    @Override
    public User getUser() {
        return null;
    }
}
