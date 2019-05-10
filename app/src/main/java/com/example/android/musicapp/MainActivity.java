package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Set the content of the activity to use the activity_main.xml layout file*/
        setContentView(R.layout.activity_main);

        /**Find the View that shows the hip hop category*/
        TextView hiphop = (TextView) findViewById(R.id.hiphop);

        /**Set a click listener on that View*/
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip hop category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the HipHopActivity*/
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);

                /**Start the new activity*/
                startActivity(hiphopIntent);
            }
        });

        /**Find the View that shows the pop category*/
        TextView pop = (TextView) findViewById(R.id.pop);

        /**Set a click listener on that View*/
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the PopActivity*/
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                /**Start the new activity*/
                startActivity(popIntent);
            }
        });

        /**Find the View that shows the alternative rock category*/
        TextView alternativerock = (TextView) findViewById(R.id.alternativerock);

        /**Set a click listener on that View*/
        alternativerock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alternative rock category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the AlternativeRockActivity*/
                Intent alternativerockIntent = new Intent(MainActivity.this, AlternativeRockActivity.class);

                /**Start the new activity*/
                startActivity(alternativerockIntent);
            }
        });
    }
}