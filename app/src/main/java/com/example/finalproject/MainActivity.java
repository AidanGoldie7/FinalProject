package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    //STEP 1 - create a timer for how long the splashscreen will show
    //3000 = 3 SECONDS
    private static int Splash_Time_Out = 3000;


    //This section doesn't change
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is the code needed to decide what activity this screen will go to
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //MainScreen.class is the main menu where the app will travel to after
                //the 3 seconds
                Intent HomeIntent = new Intent(MainActivity.this, MainScreen.class);
                startActivity(HomeIntent);
                finish();
            }

            //starts the 3 second count
        }, Splash_Time_Out);
    }
}