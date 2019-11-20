package com.example.invuya.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.R;
import com.example.invuya.RiwayatFragment2.DalamRiwayat2;
import com.example.invuya.RiwayatFragment3.DalamRiwayat3;

public class IkanLeleRiwayat2 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_lele_riwayat2);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IkanLeleRiwayat2.this, DalamRiwayat3.class);
                startActivity(intent);
            }
        });
    }
    public void prospektuslele(View view) {
        Intent link1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1MRnF0M34Zv5y-0rTko0s7z03VlsW8wZM"));
        startActivity(link1);
    }
}
