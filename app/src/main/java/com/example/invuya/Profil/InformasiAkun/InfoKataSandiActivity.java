package com.example.invuya.Profil.InformasiAkun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Profil.InformasiAkunActivity;
import com.example.invuya.R;

public class InfoKataSandiActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kata_sandi);

        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoKataSandiActivity.this, InformasiAkunActivity.class);
                startActivity(intent);
            }
        });
    }
}
