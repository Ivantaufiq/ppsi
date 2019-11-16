package com.example.invuya.Profil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Intent.Profil.ProfilActivity2Intent;
import com.example.invuya.Profil.InformasiAkun.InfoEmailActivity;
import com.example.invuya.Profil.InformasiAkun.InfoKataSandiActivity;
import com.example.invuya.Profil.InformasiAkun.InfoNoHpActivity;
import com.example.invuya.R;

public class InformasiAkunActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_akun);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformasiAkunActivity.this, ProfilActivity2Intent.class);
                startActivity(intent);
            }
        });
    }

    public void pindahemail(View view) {
        Intent intent = new Intent(InformasiAkunActivity.this, InfoEmailActivity.class);
        startActivity(intent);
    }

    public void pindahnohp(View view) {
        Intent intent = new Intent(InformasiAkunActivity.this, InfoNoHpActivity.class);
        startActivity(intent);
    }

    public void pindahkatasandi(View view) {
        Intent intent = new Intent(InformasiAkunActivity.this, InfoKataSandiActivity.class);
        startActivity(intent);
    }
}
