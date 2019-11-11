package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanMas extends AppCompatActivity {
    private int naik4 = 0;
    Button countup4, countdown4;
    TextView hasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_mas);

        countup4 = (Button) findViewById(R.id.countup4);
        countdown4 = (Button) findViewById(R.id.countdown4);
        hasil4 = (TextView) findViewById(R.id.hasil4);

        countup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik4 ++;
                hasil4.setText(Integer.toString(naik4));
            }
        });

        countdown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik4 --;
                hasil4.setText(Integer.toString(naik4));
            }
        });
    }
}