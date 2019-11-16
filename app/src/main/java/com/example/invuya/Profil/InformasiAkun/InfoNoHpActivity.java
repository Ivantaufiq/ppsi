package com.example.invuya.Profil.InformasiAkun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Profil.InformasiAkunActivity;
import com.example.invuya.R;

public class InfoNoHpActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_no_hp);

        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoNoHpActivity.this, InformasiAkunActivity.class);
                startActivity(intent);
            }
        });
    }
}
