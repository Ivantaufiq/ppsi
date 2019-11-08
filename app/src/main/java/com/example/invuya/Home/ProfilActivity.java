package com.example.invuya.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Profil.FaqActivity;
import com.example.invuya.Profil.DataDiriActivity;
import com.example.invuya.Profil.HubKamiActivity;
import com.example.invuya.Profil.InformasiAkunActivity;
import com.example.invuya.Profil.JadiMitraActivity;
import com.example.invuya.Profil.SyaratActivity;
import com.example.invuya.R;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void pindahdatadiri(View view) {
        Intent i = new Intent(ProfilActivity.this, DataDiriActivity.class);
        startActivity(i);
    }

    public void pindahinformasiakun(View view) {
        Intent i = new Intent(ProfilActivity.this, InformasiAkunActivity.class);
        startActivity(i);
    }

    public void pindahsyarat(View view) {
        Intent i = new Intent(ProfilActivity.this, SyaratActivity.class);
        startActivity(i);
    }

    public void pindahfaq(View view) {
        Intent i = new Intent(ProfilActivity.this, FaqActivity.class);
        startActivity(i);
    }

    public void pindahjadimitra(View view) {
        Intent i = new Intent(ProfilActivity.this, JadiMitraActivity.class);
        startActivity(i);
    }

    public void pindahhubungikami(View view) {
        Intent i = new Intent(ProfilActivity.this, HubKamiActivity.class);
        startActivity(i);
    }

}
