package com.example.android.fitplan;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Workout_detail extends AppCompatActivity {
    public  static Timer timer ;
    TextView time;
    Button startButton;
    Context context;

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
                String text = String.format(Locale.getDefault(), "%02d : %02d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % 60,
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60);
                time.setText(text);
            }
            @Override
            public void onFinish() {

                time.setText("00 : 00");
                String txt="Workout Completed";
                Toast.makeText(context,txt,Toast.LENGTH_LONG).show();

            }
        };
        countDownTimer.start();
    }

}
