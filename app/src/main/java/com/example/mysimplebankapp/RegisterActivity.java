package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViewById(R.id.registerBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, LoginActivity.class);
            startActivity(I);
            finish();
        });
    }
}