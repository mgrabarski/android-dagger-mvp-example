package com.mateusz.grabarski.androidmvpdagger.views.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mateusz.grabarski.androidmvpdagger.R;
import com.mateusz.grabarski.androidmvpdagger.views.login.contract.LoginContract;
import com.mateusz.grabarski.androidmvpdagger.views.login.di.DaggerLoginComponent;
import com.mateusz.grabarski.androidmvpdagger.views.login.di.LoginModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @BindView(R.id.activity_login_first_name_et)
    EditText firstNameEt;

    @BindView(R.id.activity_login_last_name_et)
    EditText lastNameEt;

    @Inject
    LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        DaggerLoginComponent.builder()
                .loginModule(new LoginModule())
                .build()
                .inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @OnClick(R.id.activity_login_btn)
    public void onLoginClick() {
        presenter.loginButtonClick();
    }

    @Override
    public String getFirstName() {
        return firstNameEt.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastNameEt.getText().toString();
    }

    @Override
    public void showUserIsNotAvailableMessage() {
        Toast.makeText(this, "Error the user not available", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "Input error", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserSaveMessage() {
        Toast.makeText(this, "User saved", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setFirstName(String firstName) {
        firstNameEt.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        lastNameEt.setText(lastName);
    }
}
