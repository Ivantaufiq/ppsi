package com.example.invuya.RiwayatFragment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Intent.Home.Home2;
import com.example.invuya.Intent.Home.HomeProyekUpdate2;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class DalamRiwayat3 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;
    private TabLayout tabLayout3;
    private ViewPager viewPager3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalam_riwayat3);

        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        tabLayout3 = findViewById(R.id.tablayout_id3);
        viewPager3 = findViewById(R.id.viewpager_id3);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPenggalangan3(), "Masa Penggalangan");
        adapter.AddFragment(new FragmentProyekberjalan3(), "Proyek Berjalan");
        adapter.AddFragment(new FragmentProyekselesai3(), "Proyek Selesai");

        viewPager3.setAdapter(adapter);
        tabLayout3.setupWithViewPager(viewPager3);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DalamRiwayat3.this, HomeProyekUpdate2.class);
                startActivity(intent);
            }
        });
    }
}
