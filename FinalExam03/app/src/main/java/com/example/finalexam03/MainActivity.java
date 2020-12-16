package com.example.finalexam03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button = findViewById(R.id.btn);


    public void onClick(View view) {
        PopupMenu popup = new PopupMenu(this, button);
        popup.getMenuInflater().inflate(R.menu.getMenu());
    }

    public void onRadio(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.dog:
                if (checked) {

                }
                break;
            case R.id.cat:
                if (checked) {

                }
                break;
            case R.id.rabbit:
                if (checked) {

                }
                break;
            case R.id.horse:
                if (checked) {

                }
                break;
        }
    }
}