package com.mateusz.grabarski.androidmvpdagger.views.login.contract;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.mateusz.grabarski.androidmvpdagger.data.models.User;

/**
 * Created by Mateusz Grabarski on 30.01.2018.
 */

public class LoginPresenter implements LoginContract.Presenter {

    @Nullable
    private LoginContract.View mView;

    private LoginContract.Model mModel;

    public LoginPresenter(LoginContract.Model model) {
        this.mModel = model;
    }

    @Override
    public void setView(LoginContract.View view) {
        this.mView = view;
    }

    @Override
    public void loginButtonClick() {
        if (mView != null) {
            String firstName = mView.getFirstName();
            String lastName = mView.getLastName();

            if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName)) {
                mView.showInputError();
            } else {
                mModel.createUser(firstName, lastName);
                mView.showUserSaveMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = mModel.getUser();

        if (user == null && mView != null) {
            mView.showUserIsNotAvailableMessage();
        } else {
            if (mView != null) {
                mView.setFirstName(user.getFirstName());
                mView.setLastName(user.getLastName());
            }
        }
    }
}
