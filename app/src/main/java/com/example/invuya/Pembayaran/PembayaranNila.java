package com.example.invuya.Pembayaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.invuya.Intent.Home.HomeDataDiriFix;
import com.example.invuya.Intent.Home.HomePembayaran;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiLele;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiNila2;
import com.example.invuya.R;

public class PembayaranNila extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_nila);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PembayaranNila.this, HomePembayaran.class);
                startActivity(intent);
            }
        });

    }

    public void konfirmasinila(View view) {
        Intent intent = new Intent(PembayaranNila.this, KonfirmasiNila2.class);
        startActivity(intent);
    }

    public void batalkan(View view) {
        Intent intent = new Intent(PembayaranNila.this, HomeDataDiriFix.class);
        startActivity(intent);

        Toast.makeText(getApplicationContext(),"Berhasil Batalkan Investasi",Toast.LENGTH_SHORT).show();

    }
}
