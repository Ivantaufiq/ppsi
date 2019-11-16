package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.invuya.Home.CariProyekActivity;
import com.example.invuya.R;

public class IkanMujair extends AppCompatActivity {
    private int naik7 = 0;
    Button countup7, countdown7;
    TextView hasil7;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_mujair);

        countup7 = (Button) findViewById(R.id.countup7);
        countdown7 = (Button) findViewById(R.id.countdown7);
        hasil7 = (TextView) findViewById(R.id.hasil7);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanMujair.this, CariProyekActivity.class);
                startActivity(intent);
            }
        });

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
