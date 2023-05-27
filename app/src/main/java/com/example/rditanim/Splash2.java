package com.example.rditanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Splash2 extends AppCompatActivity {

    View first, second, third, fourth, fifth, sixth;
    TextView brandName, slogan;
    RelativeLayout top;
    Animation top_animation, middle_animation, bottomAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_splash2);
        init();
        loadAnimation();

    }

    public void loadAnimation()
    {

        first.setAnimation(top_animation);
        second.setAnimation(top_animation);
        third.setAnimation(top_animation);
        fourth.setAnimation(top_animation);
        fifth.setAnimation(top_animation);
        sixth.setAnimation(top_animation);
        brandName.setAnimation(middle_animation);
        slogan.setAnimation(bottomAnimation);
        //top.setAnimation(top_animation);

    }

    public void init()
    {
        top = findViewById(R.id.top);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        brandName = findViewById(R.id.brandName);
        slogan = findViewById(R.id.slogan);
        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        middle_animation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
    }
}