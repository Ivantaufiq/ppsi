package com.example.invuya.Intent.CariProyek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.DaftarProyek.IkanGabus;
import com.example.invuya.DaftarProyek.IkanLele;
import com.example.invuya.DaftarProyek.IkanLele2;
import com.example.invuya.DaftarProyek.IkanMas;
import com.example.invuya.DaftarProyek.IkanMujair;
import com.example.invuya.DaftarProyek.IkanNila;
import com.example.invuya.DaftarProyek.IkanPatin;
import com.example.invuya.Home.CariProyekActivity;
import com.example.invuya.HomeActivity;
import com.example.invuya.Intent.Home.HomeDataDiriFix;
import com.example.invuya.R;

public class DaftarProyek extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_proyek);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarProyek.this, HomeDataDiriFix.class);
                startActivity(intent);
            }
        });
    }
    public void pindahlele(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanLele.class);
        startActivity(i);
    }

    public void pindahlele2(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanLele2.class);
        startActivity(i);
    }

    public void pindahnila(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanNila.class);
        startActivity(i);
    }

    public void pindahpatin(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanPatin.class);
        startActivity(i);
    }

    public void pindahmas(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanMas.class);
        startActivity(i);
    }

    public void pindahgabus(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanGabus.class);
        startActivity(i);
    }

    public void pindahmujair(View view) {
        Intent i = new Intent(DaftarProyek.this, IkanMujair.class);
        startActivity(i);
    }
}
