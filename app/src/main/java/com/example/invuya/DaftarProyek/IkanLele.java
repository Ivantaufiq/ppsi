package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.invuya.KonfirmasiPembayaran.KonfirmasiLele;
import com.example.invuya.R;

public class IkanLele extends AppCompatActivity {
    private int naik = 0;
    Button countup, countdown;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_lele);

        countup = (Button) findViewById(R.id.countup);
        countdown = (Button) findViewById(R.id.countdown);
        hasil = (TextView) findViewById(R.id.hasil);

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
