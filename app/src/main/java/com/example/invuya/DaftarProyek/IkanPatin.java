package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanPatin extends AppCompatActivity {
    private int naik3 = 0;
    Button countup3, countdown3;
    TextView hasil3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_patin);

        countup3 = (Button) findViewById(R.id.countup3);
        countdown3 = (Button) findViewById(R.id.countdown3);
        hasil3 = (TextView) findViewById(R.id.hasil3);

        countup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik3 ++;
                hasil3.setText(Integer.toString(naik3));
            }
        });

        countdown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik3 --;
                hasil3.setText(Integer.toString(naik3));
            }
        });
    }
}
