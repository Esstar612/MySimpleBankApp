package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        findViewById(R.id.signInBtn).setOnClickListener(view -> {
            Intent I = new Intent(LoginActivity.this, Dashboard.class);
            startActivity(I);
            finish();
        });

        findViewById(R.id.newRegisterBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, RegisterActivity.class);
            startActivity(I);
            finish();
        });
    }
}