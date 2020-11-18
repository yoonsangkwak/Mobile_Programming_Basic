package com.example.graphic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // View 클래스를 이용해서 상속받는다
    class MyView extends View {
        public MyView(Context context) {
            super(context);
            setBackgroundColor(Color.BLUE);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // canvas 클래스, paint 클래스
            Paint paint = new Paint();
            paint.setColor(Color.YELLOW);
            paint.setStrokeWidth(20);
            canvas.drawLine(100, 100, 700, 100, paint);
            canvas.drawRect(100, 300, 700, 700, paint);
            canvas.drawCircle(300, 1200, 200, paint);
            paint.setTextSize(80);
            canvas.drawText("여기에 텍스트를 입력해보자", 100, 900, paint);
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