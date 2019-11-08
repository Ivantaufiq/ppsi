package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanGabus extends AppCompatActivity {
    private int naik5 = 0;
    Button countup5, countdown5;
    TextView hasil5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_gabus);

        countup5 = (Button) findViewById(R.id.countup5);
        countdown5 = (Button) findViewById(R.id.countdown5);
        hasil5 = (TextView) findViewById(R.id.hasil5);

        countup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik5 ++;
                hasil5.setText(Integer.toString(naik5));
            }
        });

        countdown5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik5 --;
                hasil5.setText(Integer.toString(naik5));
            }
        });
    }
}
