package com.example.nqsee.multiplescreens2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    public static  String mode="light";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        CheckBox nightMode = findViewById(R.id.nightMode);
        Button back=findViewById(R.id.back);
         LinearLayoutCompat mainLayout=findViewById(R.id.mainLayout);


        nightMode.setOnClickListener((v)->{
            if(((CheckBox)v).isChecked() )
               mode="night";
            else mode="light";

        });
            back.setOnClickListener((v)->{
           loadMainActivity();
       });

    }
    private  void loadMainActivity(){
        Intent intent=new Intent(SettingsActivity.this,MainActivity.class);
        startActivity(intent);
    }

}
