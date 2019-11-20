package com.example.invuya.Intent.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Home.ProfilActivity;
import com.example.invuya.Home.RiwayatActivity;
import com.example.invuya.Intent.CariProyek2.DaftarProyekLeleTerisi;
import com.example.invuya.Intent.Profil.ProfilActivity2Intent;
import com.example.invuya.Pembayaran.PembayaranLele;
import com.example.invuya.Pembayaran.PembayaranNila;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment2.DalamRiwayat2;

public class Home2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }

    public void pindahprofil(View view) {
        Intent intent = new Intent(Home2.this, ProfilActivity2Intent.class);
        startActivity(intent);
    }

    public void pindahpembayaran2(View view) {
        Intent intent = new Intent(Home2.this, PembayaranLele.class);
        startActivity(intent);
    }

    public void pindahriwayat(View view) {
        Intent intent = new Intent(Home2.this, DalamRiwayat2.class);
        startActivity(intent);
    }

    public void pindahproyek(View view) {
        Intent intent = new Intent(Home2.this, DaftarProyekLeleTerisi.class);
        startActivity(intent);
    }

    public void berita1(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita2(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita3(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita4(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }
}
