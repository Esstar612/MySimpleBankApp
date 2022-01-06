package com.example.mysimplebankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        findViewById(R.id.checkAccBalBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, BalanceActivity.class);
            startActivity(I);
            finish();
        });

        findViewById(R.id.transferFundsBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, TransferActivity.class);
            startActivity(I);
            finish();
        });

        findViewById(R.id.airtTopUpBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, AirtimeActivity.class);
            startActivity(I);
            finish();
        });

        findViewById(R.id.rechCableTvBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, CableTv.class);
            startActivity(I);
            finish();
        });

        findViewById(R.id.paymentHistoryBtn).setOnClickListener(view -> {
            Intent I = new Intent(this, PaymentActivity.class);
            startActivity(I);
            finish();
        });

    }
}