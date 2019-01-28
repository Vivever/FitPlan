package com.example.android.fitplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity extends AppCompatActivity {

    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        button = findViewById(R.id.startnow);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(getApplicationContext(),StartWorkoutActivity.class);
//               startActivity(intent);
//            }
//        });

    }
    public void onclick(View view)
    {
        Intent intent= new Intent(WorkoutActivity.this,StartWorkoutActivity.class);
        startActivity(intent);
    }
}
