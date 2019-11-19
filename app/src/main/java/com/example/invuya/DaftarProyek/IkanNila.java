package com.example.invuya.DaftarProyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.invuya.Intent.CariProyek2.DaftarProyek;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiNila;
import com.example.invuya.R;

public class IkanNila extends AppCompatActivity {
    private int naik2 = 0;
    Button countup2, countdown2;
    TextView hasil2;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_nila);

        countup2 = (Button) findViewById(R.id.countup2);
        countdown2 = (Button) findViewById(R.id.countdown2);
        hasil2 = (TextView) findViewById(R.id.hasil2);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanNila.this, DaftarProyek.class);
                startActivity(intent);
            }
        });

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

    public void investnila(View view) {
        Intent intent = new Intent(IkanNila.this, KonfirmasiNila.class);
        startActivity(intent);
    }
}
