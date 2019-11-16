package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.invuya.Home.CariProyekActivity;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiLele;
import com.example.invuya.R;

public class IkanLele extends AppCompatActivity {
    private int naik = 0;
    Button countup, countdown;
    TextView hasil;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_lele);

        countup = (Button) findViewById(R.id.countup);
        countdown = (Button) findViewById(R.id.countdown);
        hasil = (TextView) findViewById(R.id.hasil);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanLele.this, CariProyekActivity.class);
                startActivity(intent);
            }
        });

        countup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik ++;
                hasil.setText(Integer.toString(naik));
            }
        });

        countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik --;
                hasil.setText(Integer.toString(naik));
            }
        });
    }

    public void investlele(View view) {
        Intent intent = new Intent(IkanLele.this, KonfirmasiLele.class);
        startActivity(intent);
    }
}
