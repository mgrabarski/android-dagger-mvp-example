package com.mateusz.grabarski.androidmvpdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mateusz.grabarski.androidmvpdagger.base.App;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getApplicationComponent().inject(this);
    }
}
