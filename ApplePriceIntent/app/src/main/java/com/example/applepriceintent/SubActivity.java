package com.example.applepriceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        result = findViewById(R.id.resultView);

        Intent intent = getIntent();
        String appleNumber = intent.getStringExtra("number");
        String applePrice = intent.getStringExtra("price");

        int totalPrice = Integer.parseInt(appleNumber) * Integer.parseInt(applePrice);

        result.setText("사과의 가격은 : " + totalPrice + "입니다. ");
    }
}