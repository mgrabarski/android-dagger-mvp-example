package com.mateusz.grabarski.androidmvpdagger.data.repository;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public interface LoginRepository {
    User getUser();
    void saveUser(User user);
}
