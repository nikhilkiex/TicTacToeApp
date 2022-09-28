package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent init = new Intent(SplashScreen.this,MainActivity.class);
                 startActivity(init);
                 finish();
             }
         }, 5000);

    }
}