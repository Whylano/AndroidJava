package com.reo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //생성된 View의 주소값을 가져온다.
        btn1 = findViewById(R.id.button);
        text1 = findViewById(R.id.textView);

        BtnListener listener1 = new BtnListener();
        btn1.setOnClickListener(listener1);
    }
    //버튼을 누르면 동작할 리스너
    class BtnListener implements View.OnClickListener{//뷰를 동작할때 쓰는 Listnere클래스

        @Override
        public void onClick(View v) {//클릭을 했을때 호출되는 메서드
            text1.setText("버튼을 눌렀습니다");
        }
    }
}