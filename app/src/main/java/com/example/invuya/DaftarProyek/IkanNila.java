package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanNila extends AppCompatActivity {
    private int naik2 = 0;
    Button countup2, countdown2;
    TextView hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_nila);

        countup2 = (Button) findViewById(R.id.countup2);
        countdown2 = (Button) findViewById(R.id.countdown2);
        hasil2 = (TextView) findViewById(R.id.hasil2);

        countup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik2 ++;
                hasil2.setText(Integer.toString(naik2));
            }
        });

        countdown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik2 --;
                hasil2.setText(Integer.toString(naik2));
            }
        });
    }
}
