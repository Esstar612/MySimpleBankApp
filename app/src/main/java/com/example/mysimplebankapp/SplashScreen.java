package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT= 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //findViewById(R.id.skipBtn).setOnClickListener(view -> {
            //Intent I = new Intent(this, LoginActivity.class);
        //});

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent I = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(I);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);
    }
}