package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanLele2 extends AppCompatActivity {
    private int naik6 = 0;
    Button countup6, countdown6;
    TextView hasil6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_lele2);

        countup6 = (Button) findViewById(R.id.countup6);
        countdown6 = (Button) findViewById(R.id.countdown6);
        hasil6 = (TextView) findViewById(R.id.hasil6);

        countup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik6 ++;
                hasil6.setText(Integer.toString(naik6));
            }
        });

        countdown6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik6 --;
                hasil6.setText(Integer.toString(naik6));
            }
        });
    }
}
