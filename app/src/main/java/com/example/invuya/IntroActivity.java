package com.example.invuya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {
    private ImageView iv1, iv2;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_down);
        iv1.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_right);
        iv2.setAnimation(animation);

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(2000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                super.run();
            }
        };
        thread.start();
    }
}
