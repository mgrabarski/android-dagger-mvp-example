package com.mateusz.grabarski.androidmvpdagger.data.managers.memory;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;
import com.mateusz.grabarski.androidmvpdagger.data.repository.LoginRepository;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class LoginManager implements LoginRepository {

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void saveUser() {

    }
}
