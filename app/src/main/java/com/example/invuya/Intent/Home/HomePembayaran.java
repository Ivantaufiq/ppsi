package com.example.invuya.Intent.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Home.CariProyekActivity;
import com.example.invuya.Home.ProfilActivity;
import com.example.invuya.Home.RiwayatActivity;
import com.example.invuya.Pembayaran.PembayaranNila;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment2.DalamRiwayat2;

public class HomePembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pembayaran);
    }

    public void pindahprofil(View view) {
        Intent intent = new Intent(HomePembayaran.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void pindahpembayaran2(View view) {
        Intent intent = new Intent(HomePembayaran.this, PembayaranNila.class);
        startActivity(intent);
    }

    public void pindahriwayat(View view) {
        Intent intent = new Intent(HomePembayaran.this, DalamRiwayat2.class);
        startActivity(intent);
    }

    public void pindahproyek(View view) {
        Intent intent = new Intent(HomePembayaran.this, CariProyekActivity.class);
        startActivity(intent);
    }

    public void berita1(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/11"));
        startActivity(link1);
    }

    public void berita2(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/9"));
        startActivity(link1);
    }

    public void berita3(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/10"));
        startActivity(link1);
    }

    public void berita4(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/12"));
        startActivity(link1);
    }

    public void berita7(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/13"));
        startActivity(link1);
    }

    public void berita5(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/8"));
        startActivity(link1);
    }

    public void berita6(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/6"));
        startActivity(link1);
    }

    public void berita8(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://invuya.xyz/isiinformasi/7"));
        startActivity(link1);
    }
}
