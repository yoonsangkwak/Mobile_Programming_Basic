package com.example.pretest01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefs";
    EditText value;
    String imageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = findViewById(R.id.EditText01);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        imageName = settings.getString("imageName", "");
        value.setText(imageName);
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        imageName = value.getText().toString();
        editor.putString("imageName", imageName);
        editor.commit();
    }
}