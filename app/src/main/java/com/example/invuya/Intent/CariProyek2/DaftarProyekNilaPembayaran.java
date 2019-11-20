package com.example.invuya.Intent.CariProyek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Intent.Home.Home2;
import com.example.invuya.Intent.Home.HomePembayaran;
import com.example.invuya.R;

public class DaftarProyekNilaPembayaran extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_proyek_nila_pembayaran);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarProyekNilaPembayaran.this, HomePembayaran.class);
                startActivity(intent);
            }
        });
    }
}
