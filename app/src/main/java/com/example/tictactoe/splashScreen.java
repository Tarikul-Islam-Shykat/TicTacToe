package com.example.tictactoe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        LottieAnimationView lottieAnimationView = findViewById(R.id.splashScreen);
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        lottieAnimationView.setSpeed((float) 2.0);

        LottieAnimationView ready = findViewById(R.id.ready);
        ready.playAnimation();
        ready.loop(true);
        final Intent intent = new Intent(splashScreen.this, input.class);

        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
    //android:background="#343e56"
}