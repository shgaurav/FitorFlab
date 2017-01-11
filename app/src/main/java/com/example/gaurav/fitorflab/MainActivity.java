package com.example.gaurav.fitorflab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "weight lifting";
    public static final String EXERCISE_YOGA = "yoga";
    public static final String EXERCISE_CARDIO = "cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

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

    }

    private void loadDetailActivity(String exerciseTitle)
    {   //message to OS to do something.
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class); //where it is coming from, what is laoding to.
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
