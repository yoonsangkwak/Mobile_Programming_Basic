package com.example.transition2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;
    private Button fadeButton, slideButton, explodeButton;
    private ImageView imageView, imageView2;
    boolean visible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.linearlayout);
        fadeButton = findViewById(R.id.fade);
        slideButton = findViewById(R.id.slide);
        explodeButton = findViewById(R.id.explode);
        imageView = findViewById(R.id.imageview);

        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(layout, new Fade());
                visible = !visible;
                imageView.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        slideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(layout, new Slide());
                visible = !visible;
                imageView.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        explodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(layout, new Explode());
                visible = !visible;
                imageView.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });
    }
}