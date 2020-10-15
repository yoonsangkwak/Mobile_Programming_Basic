package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 부모 클래스에 있는 메소드 실행

        setContentView(R.layout.activity_main);



        // java ;문장을 구분한다
        // 문장단위로 해석을 하고 실행을 한다.

        // manifests, java, res(layout)

        // ui, java 소스 부분을 분리시켰습니다.
        // layout => ui 설정
        // java => 실행했을 때 계산하는 영역

        // onCreate 메소드는 AppCompatActivity 에 존재함
        // 재정의해서 onCreate 메소드를 사용하고 싶을 때 @Override 메소드 이름이 같은지 체크
        // onCreate 2개 존재 => MainActivity, AppCompatActivity
        // AppCompatActivity => super.onCreate()

        // java => main()
        // MainActivity => onCreate() 제일 먼저 실행

        // onCreate(Bundle savedInstanceState) => 실행 이전의 상태를 저장했다가 다시 그 상태의 값을 전달해주는 역할


    }

    public void onClicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
}