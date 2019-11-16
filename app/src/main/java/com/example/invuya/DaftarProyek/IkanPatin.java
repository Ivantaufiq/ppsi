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
import com.example.invuya.Intent.CariProyek2.DaftarProyek;
import com.example.invuya.R;

public class IkanPatin extends AppCompatActivity {
    private int naik3 = 0;
    Button countup3, countdown3;
    TextView hasil3;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_patin);

        countup3 = (Button) findViewById(R.id.countup3);
        countdown3 = (Button) findViewById(R.id.countdown3);
        hasil3 = (TextView) findViewById(R.id.hasil3);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanPatin.this, DaftarProyek.class);
                startActivity(intent);
            }
        });

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
