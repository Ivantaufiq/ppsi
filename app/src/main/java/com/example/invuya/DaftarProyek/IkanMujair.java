package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.R;

public class IkanMujair extends AppCompatActivity {
    private int naik7 = 0;
    Button countup7, countdown7;
    TextView hasil7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_mujair);

        countup7 = (Button) findViewById(R.id.countup7);
        countdown7 = (Button) findViewById(R.id.countdown7);
        hasil7 = (TextView) findViewById(R.id.hasil7);

        countup7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik7 ++;
                hasil7.setText(Integer.toString(naik7));
            }
        });

        countdown7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik7 --;
                hasil7.setText(Integer.toString(naik7));
            }
        });
    }
}
