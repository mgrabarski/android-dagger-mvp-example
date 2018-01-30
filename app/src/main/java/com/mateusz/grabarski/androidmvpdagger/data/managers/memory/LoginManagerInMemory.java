package com.mateusz.grabarski.androidmvpdagger.data.managers.memory;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;
import com.mateusz.grabarski.androidmvpdagger.data.repository.LoginRepository;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class LoginManagerInMemory implements LoginRepository {

    private User mUser;

    @Override
    public User getUser() {
        if (mUser == null) {
            User user = new User("Empty", "Empty");
            user.setId(0);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }

        this.mUser = user;
    }
}
