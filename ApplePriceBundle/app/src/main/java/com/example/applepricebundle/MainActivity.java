package com.example.applepricebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText appleNumber, applePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callApplePrice(View view) {

        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        appleNumber = findViewById(R.id.appleNum);
        applePrice = findViewById(R.id.applePrice);

        Bundle bundle = new Bundle();
        bundle.putInt("number", Integer.parseInt(appleNumber.getText().toString()));
        bundle.putInt("price", Integer.parseInt(applePrice.getText().toString()));

        intent.putExtras(bundle);
        startActivity(intent);
    }
}