package com.example.invuya.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.HomeActivity;
import com.example.invuya.Profil.FaqActivity;
import com.example.invuya.Profil.DataDiriActivity;
import com.example.invuya.Profil.HubKamiActivity;
import com.example.invuya.Profil.InformasiAkunActivity;
import com.example.invuya.Profil.JadiMitraActivity;
import com.example.invuya.Profil.SyaratActivity;
import com.example.invuya.R;

public class ProfilActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfilActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

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
