package com.example.imagedisp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

class MyView extends View {
    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        Bitmap sb = Bitmap.createScaledBitmap(b, 160, 180, false);
        canvas.drawBitmap(sb, 0, 0, null);
        canvas.drawBitmap(b, 0, 250, null);
    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView w = new MyView(this);
        setContentView(w);
    }
}