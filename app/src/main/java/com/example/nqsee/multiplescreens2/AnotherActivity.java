package com.example.nqsee.multiplescreens2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TextView excerciseTxt=findViewById(R.id.excerciceTxt);
        ImageView excerciseImg=findViewById(R.id.excerciseImg);
        LinearLayoutCompat mainLayout= findViewById(R.id.mainLayout);


        String excersiceTitle=getIntent().getStringExtra(MainActivity.EXERCISE_TITLE);
        excerciseTxt.setText(excersiceTitle);


        if(excersiceTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)){
            excerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight,getApplicationContext().getTheme()));
            if(SettingsActivity.mode.equalsIgnoreCase("night"))
                mainLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
            else
            mainLayout.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }
        else if(excersiceTitle.equalsIgnoreCase(MainActivity.EXERCISE_LOTUS)){
            excerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            if(SettingsActivity.mode.equalsIgnoreCase("night"))
                mainLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
            else
            mainLayout.setBackgroundColor(Color.parseColor("#916bcd"));
        }
        else{
            excerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart,getApplicationContext().getTheme()));
            if(SettingsActivity.mode.equalsIgnoreCase("night"))
                mainLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
            else
            mainLayout.setBackgroundColor(Color.parseColor("#52ad56"));
        }

    }
}
