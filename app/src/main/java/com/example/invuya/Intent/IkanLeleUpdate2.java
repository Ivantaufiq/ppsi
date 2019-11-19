package com.example.invuya.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Intent.CariProyek2.DaftarProyekLeleTerisi;
import com.example.invuya.Intent.CariProyek2.DaftarProyekNilaTerisi;
import com.example.invuya.R;

public class IkanLeleUpdate2 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_lele_update2);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanLeleUpdate2.this, DaftarProyekNilaTerisi.class);
                startActivity(intent);
            }
        });
    }
    public void prospektuslele(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BryH3ISZmn5ayasDHgwi5LTTFIx1QPaC"));
        startActivity(link1);
    }
}
