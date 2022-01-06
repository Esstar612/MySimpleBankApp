package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TransferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        findViewById(R.id.transferDashboard).setOnClickListener(view -> {
            Intent I = new Intent(this, Dashboard.class);
            startActivity(I);
            finish();
        });
    }
}