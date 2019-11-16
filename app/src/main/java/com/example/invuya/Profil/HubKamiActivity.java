package com.example.invuya.Profil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Home.ProfilActivity;
import com.example.invuya.Intent.Profil.ProfilActivity2Intent;
import com.example.invuya.R;

public class HubKamiActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_kami);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HubKamiActivity.this, ProfilActivity2Intent.class);
                startActivity(intent);
            }
        });
    }

    public void facebook(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(link1);
    }

    public void instagram(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
        startActivity(link1);
    }

    public void youtube(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
        startActivity(link1);
    }
}
