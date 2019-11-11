package com.example.invuya.Pembayaran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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
}
