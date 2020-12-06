package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView timer;
    private ScrollView scrollView;
    private TextView record;
    private Button btn_start, btn_lap;

    public static final int INIT = 0;
    public static final int RUN = 1;
    public static final int PAUSE = 2;

    public static int status = INIT;

    private int count = 1;

    private long baseTime, pauseTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = (TextView) findViewById(R.id.timer);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        record = (TextView) findViewById(R.id.record);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_lap = (Button) findViewById(R.id.btn_lap);
        btn_lap.setEnabled(false);

        btn_start.setOnClickListener(onClickListener);
        btn_lap.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_start:
                    startTime();
                    break;
                case R.id.btn_lap:
                    lapTime();
                    break;
            }
        }
    };

    private void startTime() {
        switch (status) {
            case INIT:
                baseTime = SystemClock.elapsedRealtime();

                handler.sendEmptyMessage(0);
                btn_start.setText("정지");
                btn_lap.setEnabled(true);

                status = RUN;
                break;
            case RUN:
                handler.removeMessages(0);
                pauseTime = SystemClock.elapsedRealtime();
                btn_start.setText("시작");
                btn_lap.setText("리셋");

                status = PAUSE;
                break;
            case PAUSE:
                long reStart = SystemClock.elapsedRealtime();
                baseTime += (reStart - pauseTime);

                handler.sendEmptyMessage(0);

                btn_start.setText("정지");
                btn_lap.setText("기록");

                status = RUN;
        }
    }

    private void lapTime() {
        switch (status) {
            case RUN:
                String timeList = record.getText().toString();
                timeList += String.format("%2d lap \t\t %s\n", count, getTime());

                record.setText(timeList);
                count++;
                break;
            case PAUSE:
                btn_start.setText("시작");
                btn_lap.setText("기록");
                btn_lap.setEnabled(false);

                timer.setText("00 : 00 : 00");
                record.setText("");

                baseTime = 0;
                pauseTime = 0;
                count = 1;
                status = INIT;
                Toast.makeText(getApplicationContext(), "리셋되었습니다.", Toast.LENGTH_LONG).show();
        }
    }

    private String getTime() {
        long nowTime = SystemClock.elapsedRealtime();
        long overTime = nowTime - baseTime;

        long min = overTime / 1000 / 60;
        long sec = (overTime / 1000) % 60;
        long ms = overTime % 1000;

        String lapTime = String.format("%02d : %02d : %03d", min, sec, ms);
        return lapTime;
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            timer.setText(getTime());
            handler.sendEmptyMessage(0);
        }
    };
}