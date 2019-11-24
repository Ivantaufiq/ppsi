package com.example.invuya.Intent.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Home.CariProyekActivity;
import com.example.invuya.Home.PembayaranActivity;
import com.example.invuya.Home.RiwayatActivity;
import com.example.invuya.Intent.Profil.ProfilActivity2Intent;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment2.DalamRiwayat2;

public class HomeDataDiriFix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_data_diri_fix);
    }

    public void pindahprofil(View view) {
        Intent intent = new Intent(HomeDataDiriFix.this, ProfilActivity2Intent.class);
        startActivity(intent);
    }

    public void pindahpembayaran2(View view) {
        Intent intent = new Intent(HomeDataDiriFix.this, PembayaranActivity.class);
        startActivity(intent);
    }

    public void pindahriwayat(View view) {
        Intent intent = new Intent(HomeDataDiriFix.this, RiwayatActivity.class);
        startActivity(intent);
    }

    public void pindahproyek(View view) {
        Intent intent = new Intent(HomeDataDiriFix.this, CariProyekActivity.class);
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

    public void berita5(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita6(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita7(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }

    public void berita8(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(link1);
    }
}
