package com.reo.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.reo.viewbinding.databinding.ActivityMainBinding;
import com.reo.viewbinding.databinding.ActivitySecondBinding;

public class MainActivity extends AppCompatActivity {

    //View의 주소 값을 담을 변수
//    Button button1;
//    TextView textView1;

    //ViewBinding 객체를 담을 변수
    ActivityMainBinding activityMainBinding;
    ActivitySecondBinding activitySecondBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ViewBinding 객체를 추출한다.
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot()); //파라미터값에는 activity_main.xml의 LinearLayout임
        //activitySecondBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        //setContentView(activitySecondBinding.getRoot());
        //View의 주소 값을 가져온다
//        button1 = (Button) findViewById(R.id.button);
//        textView1 = (TextView) findViewById(R.id.textView);
//
        ButtonClickListener1 buttonClickListener1 = new ButtonClickListener1();
//        button1.setOnClickListener(buttonClickListener1);
        activityMainBinding.button.setOnClickListener(buttonClickListener1);
    }

    class ButtonClickListener1 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
//            textView1.setText("버튼을 눌렸습니다");
            activityMainBinding.textView.setText("버튼을 눌렀습니다");
        }
    }
}