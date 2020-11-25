package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button b = findViewById(R.id.button02);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish();

                // 명시적인 인텐트
                /* Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent); */

                // 암시적인 인텐트트
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+82)01012345678"));
                startActivity();
            }
        });

}