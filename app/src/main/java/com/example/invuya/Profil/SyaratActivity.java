package com.example.invuya.Profil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.invuya.Intent.Profil.ProfilActivity2Intent;
import com.example.invuya.R;

public class SyaratActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    LinearLayout syaratexpandableView1, syaratexpandableView2;
    Button syaratarrowBtn1, syaratarrowBtn2;
    CardView syaratcardView1, syaratcardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat);

        syaratexpandableView1 = findViewById(R.id.syaratexpandableView1);
        syaratexpandableView2 = findViewById(R.id.syaratexpandableView2);

        syaratarrowBtn1 = findViewById(R.id.syaratarrowBtn1);
        syaratarrowBtn2 = findViewById(R.id.syaratarrowBtn2);

        syaratcardView1 = findViewById(R.id.syaratcardView1);
        syaratcardView2 = findViewById(R.id.syaratcardView2);

        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyaratActivity.this, ProfilActivity2Intent.class);
                startActivity(intent);
            }
        });
    }

    public void syarat1(View view) {
        if (syaratexpandableView1.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(syaratcardView1, new AutoTransition());
            syaratexpandableView1.setVisibility(View.VISIBLE);
            syaratarrowBtn1.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(syaratcardView1, new AutoTransition());
            syaratexpandableView1.setVisibility(View.GONE);
            syaratarrowBtn1.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }

    public void syarat2(View view) {
        if (syaratexpandableView2.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(syaratcardView2, new AutoTransition());
            syaratexpandableView2.setVisibility(View.VISIBLE);
            syaratarrowBtn2.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(syaratcardView2, new AutoTransition());
            syaratexpandableView2.setVisibility(View.GONE);
            syaratarrowBtn2.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }
}
