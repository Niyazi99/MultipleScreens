package com.example.nqsee.multiplescreens2;

import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    LinearLayoutCompat mainLayout;

    public static final String EXERCISE_TITLE="excer.item.title";
     public static  final String EXERCISE_WEIGHT="WEIGHT LIFTING";
     public static final String EXERCISE_LOTUS="YOGA";
     public  static final String EXERCISE_HEART="CARDIO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout weightScr=findViewById(R.id.weightID);
        ConstraintLayout lotusScr=findViewById(R.id.lotusID);
        ConstraintLayout heartScr=findViewById(R.id.heartID);
        mainLayout=findViewById(R.id.mainLayout);

        ImageView Settings=findViewById(R.id.settings);


        weightScr.setOnClickListener((v)->{
            loadActivity(MainActivity.EXERCISE_WEIGHT);
        });
        lotusScr.setOnClickListener((v)->{
            loadActivity(MainActivity.EXERCISE_LOTUS);
        });
      heartScr.setOnClickListener((v)->{
          loadActivity(MainActivity.EXERCISE_HEART);
   });

      Settings.setOnClickListener((v)->{
          loadSettings();
      });
        turnNightMode();

    }
    private  void loadActivity(String exercise){
        Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
        intent.putExtra(MainActivity.EXERCISE_TITLE,exercise);
        startActivity(intent);
    }
   private void loadSettings(){
       Intent intent=new Intent(MainActivity.this,SettingsActivity.class);
       startActivity(intent);
   }
   private void turnNightMode(){
        if(SettingsActivity.mode.equalsIgnoreCase("night"))
            mainLayout.setBackgroundColor(Color.parseColor("#ff669900"));
        else mainLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
   }

}
