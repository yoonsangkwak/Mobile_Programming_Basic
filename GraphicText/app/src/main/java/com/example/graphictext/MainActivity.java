package com.example.graphictext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    class MyView extends View {
        public MyView(Context context) {
            super(context);
            setBackgroundColor(Color.YELLOW);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextSize(60);

            // Typeface 클래스 => 폰트 지정 클래스
            Typeface t;
            t = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL);
            paint.setTypeface(t);
            paint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText("MONO 디폴트 폰트", 10, 400, paint);

            t = Typeface.create(Typeface.DEFAULT_BOLD, Typeface.NORMAL);
            paint.setTypeface(t);
            paint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText("MONO 디폴트 굵게 폰트", 800, 600, paint);

            t = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL);
            paint.setTypeface(t);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("MONOSPACE 폰트", 500, 800, paint);

            t = Typeface.create(Typeface.SERIF, Typeface.NORMAL);
            paint.setTypeface(t);
            paint.setUnderlineText(true);
            canvas.drawText("MONO SERIF 폰트", 10, 1000, paint);

            t = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
            paint.setTypeface(t);
            paint.setUnderlineText(false);
            paint.setStrikeThruText(true);
            paint.setTextSkewX(-0.5f);
            canvas.drawText("MONO SANS_SERIF 폰트", 10, 1200, paint);


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView w = new MyView(this);
        setContentView(w);
    }
}