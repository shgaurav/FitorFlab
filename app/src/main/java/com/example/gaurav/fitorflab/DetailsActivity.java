package com.example.gaurav.fitorflab;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Set;

public class DetailsActivity extends AppCompatActivity {

    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView exerciseTitle = (TextView)findViewById(R.id.titleView);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.activity_details);
        mainLayout = (LinearLayout) findViewById(R.id.activity_details);

        String exerciseT = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseTitle.setText(exerciseT);

        if(exerciseT.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight2x, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }
        else if(exerciseT.equalsIgnoreCase(MainActivity.EXERCISE_YOGA))
        {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus2x, getApplicationContext().getTheme()));
            exerciseImage.setPadding(0,0,0,0);
            exerciseImage.setScaleX((float)0.7);
            exerciseImage.setScaleY((float)0.7);
            mainBG.setPadding(25,0,25,0);
            mainBG.setBackgroundColor(Color.parseColor("#FF5722"));
        }
        else
        {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart2x, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(SettingActivity.NightModeActivate == true){
            mainLayout.setBackgroundColor(Color.parseColor("#212121"));
        } else {
            //mainLayout.setBackgroundColor(Color.parseColor("#ffffffff"));
        }
    }
}
