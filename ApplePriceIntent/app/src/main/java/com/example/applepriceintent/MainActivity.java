package com.example.applepriceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText appleNum, applePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callApplePrice(View view) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        appleNum = findViewById(R.id.appleNum);
        applePrice = findViewById(R.id.applePrice);

        intent.putExtra("number", appleNum.getText().toString());
        intent.putExtra("price", applePrice.getText().toString());

        startActivity(intent);
    }
}