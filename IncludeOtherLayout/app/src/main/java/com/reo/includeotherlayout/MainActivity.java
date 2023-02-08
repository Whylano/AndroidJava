package com.reo.includeotherlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.reo.includeotherlayout.databinding.ActivityMainBinding;
import com.reo.includeotherlayout.databinding.SecondBinding;
import com.reo.includeotherlayout.databinding.ThirdBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    SecondBinding secondBinding;
    ThirdBinding thirdBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        secondBinding = SecondBinding.inflate(getLayoutInflater());
        thirdBinding = ThirdBinding.inflate(getLayoutInflater());

        setContentView(activityMainBinding.getRoot());

        activityMainBinding.textView2.setText("첫 번째 문자열 입니다");
//        secondBinding.textView.setText("두 번째 문자열 입니다");
//        secondBinding.textView.setText("세 번째 문자열 입니다");
        activityMainBinding.secondLayout.textView3.setText("두 번째 문자열 입니다");
        activityMainBinding.thirdLayout.textView4.setText("세 번째 문자열 입니다");
    }
}