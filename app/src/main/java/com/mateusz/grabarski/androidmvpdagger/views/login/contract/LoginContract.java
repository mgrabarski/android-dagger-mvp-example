package com.mateusz.grabarski.androidmvpdagger.views.login.contract;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public interface LoginContract {

    interface Model {
        void createUser(String firstName, String lastName);

        User getUser();
    }

    interface View {
        String getFirstName();

        String getLastName();

        void showUserIsNotAvailableMessage();

        void showInputError();

        void showUserSaveMessage();

        void setFirstName(String firstName);

        void setLastName(String lastName);
    }

    interface Presenter {
        void setView(LoginContract.View view);

        void loginButtonClick();

        void getCurrentUser();
    }
}
