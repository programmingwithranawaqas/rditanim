package com.example.rditanim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView logoSplash;
    Animation logo_animation, light_mode_animation;
    final int SPLASH_DELAY = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        logoSplash = findViewById(R.id.splashLogo);
        logo_animation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        light_mode_animation = AnimationUtils.loadAnimation(this, R.anim.light_mode_animation);


        int current_mode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        if(current_mode == Configuration.UI_MODE_NIGHT_YES) {
            logoSplash.setAnimation(logo_animation);

            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_DELAY);
        }
        else
        {
            logoSplash.setAnimation(light_mode_animation);

            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_DELAY);
        }

    }
}