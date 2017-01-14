package com.example.gaurav.fitorflab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.io.LineNumberReader;

public class SettingActivity extends AppCompatActivity {

    public static boolean NightModeActivate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        final CheckBox nightModeBtn = (CheckBox)findViewById(R.id.nmBtn);

        LinearLayout activityDLayout = (LinearLayout) findViewById(R.id.activity_details);
        LinearLayout activtyMLayout  = (LinearLayout) findViewById(R.id.activity_main);

        if(NightModeActivate){
           nightModeBtn.setChecked(true);
        } else{
            nightModeBtn.setChecked(false);
        }

        nightModeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nightModeBtn.isChecked()){
                    NightModeActivate = true;
                } else{
                    NightModeActivate = false;
                }
            }
        });
    }
}
