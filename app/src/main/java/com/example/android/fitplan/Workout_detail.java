package com.example.android.fitplan;

import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;

public class Workout_detail extends AppCompatActivity {
    public  static Timer timer ;
    TextView time;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_detail);
        time= findViewById(R.id.time);
        startButton=findViewById(R.id.startButton);
    }
    public void startCountDown(View view)
    {
        startButton.setText("STOP");
        CountDownTimer countDownTimer = new CountDownTimer(300*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long  secRemaining = millisUntilFinished/1000;
                int minRemaining =(int)secRemaining/60;
                time.setText(minRemaining+" : "+secRemaining);
            }

            @Override
            public void onFinish() {

                time.setText("30 : 00");

            }
        };
        countDownTimer.start();
    }

}
