package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.invuya.Intent.CariProyek2.DaftarProyek;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiNila;
import com.example.invuya.R;

public class IkanNila extends AppCompatActivity {
    private int naik = 0;
    Button countup, countdown;
    TextView hasil;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_nila);

        countup = findViewById(R.id.countup2);
        countdown = findViewById(R.id.countdown2);
        hasil = findViewById(R.id.hasil2);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanNila.this, DaftarProyek.class);
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

    public void investnila(View view) {
        Intent intent = new Intent(IkanNila.this, KonfirmasiNila.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Investasi Berhasil",Toast.LENGTH_SHORT).show();
    }
}
