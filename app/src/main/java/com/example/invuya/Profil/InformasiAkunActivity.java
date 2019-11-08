package com.example.invuya.Profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Profil.InformasiAkun.InfoEmailActivity;
import com.example.invuya.Profil.InformasiAkun.InfoKataSandiActivity;
import com.example.invuya.Profil.InformasiAkun.InfoNoHpActivity;
import com.example.invuya.R;

public class InformasiAkunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_akun);
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
