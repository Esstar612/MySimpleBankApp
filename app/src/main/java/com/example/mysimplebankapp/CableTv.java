package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CableTv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cable_tv);

        findViewById(R.id.cableDashboard).setOnClickListener(view -> {
            Intent I = new Intent(this, Dashboard.class);
            startActivity(I);
            finish();
        });
    }
}