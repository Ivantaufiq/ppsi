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
import com.example.invuya.HomeActivity;
import com.example.invuya.Intent.CariProyek2.DaftarProyek;
import com.example.invuya.R;

public class IkanGabus extends AppCompatActivity {
    private int naik = 0;
    Button countup, countdown;
    TextView hasil5;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_gabus);

        countup = findViewById(R.id.countup5);
        countdown = findViewById(R.id.countdown5);
        hasil5 = findViewById(R.id.hasil5);

        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanGabus.this, DaftarProyek.class);
                startActivity(intent);
            }
        });

        countup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik ++;
                hasil5.setText(Integer.toString(naik));
            }
        });

        countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik --;
                hasil5.setText(Integer.toString(naik));
            }
        });
    }
}
