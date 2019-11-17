package com.example.invuya.Pembayaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.KonfirmasiPembayaran.KonfirmasiLele;
import com.example.invuya.R;

public class PembayaranLele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_lele);

    }

    public void konfirmasilele(View view) {
        Intent intent = new Intent(PembayaranLele.this, KonfirmasiLele.class);
        startActivity(intent);
    }

    public void batalkan(View view) {
    }
}
