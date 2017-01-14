package com.example.gaurav.fitorflab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "weight lifting";
    public static final String EXERCISE_YOGA = "yoga";
    public static final String EXERCISE_CARDIO = "cardio";
    public static final String SETTINGS_ACT = "settings";

    LinearLayout activtyMLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

        activtyMLayout  = (LinearLayout) findViewById(R.id.activity_main);

        Button settingsBtn = (Button)findViewById(R.id.settingBtn);

       weightBtn.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
               loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
           }
       });

        yogaBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });

        settingsBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loadDetailActivity2(MainActivity.SETTINGS_ACT);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        if(SettingActivity.NightModeActivate == true){
            activtyMLayout.setBackgroundColor(Color.parseColor("#212121"));
        } else {
            activtyMLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
        }
    }

    private void loadDetailActivity(String exerciseTitle)
    {   //message to OS to do something.
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class); //where it is coming from, what is laoding to.
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }

    private void loadDetailActivity2(String exerciseTitle)
    {   //message to OS to do something.
        Intent intent = new Intent(MainActivity.this, SettingActivity.class); //where it is coming from, what is laoding to.
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }


}
