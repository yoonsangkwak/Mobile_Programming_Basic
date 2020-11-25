package com.example.applepricebundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        int appleNumber = bundle.getInt("number");
        int applePrice = bundle.getInt("price");
        int totalPrice = appleNumber * applePrice;

        resultView = findViewById(R.id.resultView);
        resultView.setText("사과의 가격은 : " + totalPrice + "입니다.");

        // intent 값을 전달할 때는 String 문자열로만 값을 전달할 수 있다.
        // bundle을 통해서 하는 경우 데이터 type을 그대로 유지하면서 값을 전달할 수 있다.
    }

    public void backMain(View view) {
        finish();
        // Intent intent = new Intent(SubActivity.this, MainActivity.class);
        // startActivity(intent);
    }
}