package com.example.invuya.RiwayatFragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Home.RiwayatActivity;
import com.example.invuya.Intent.CariProyek2.DaftarProyek;
import com.example.invuya.Intent.Home.Home2;
import com.example.invuya.Intent.Home.HomeDataDiriFix;
import com.example.invuya.Intent.Home.HomeProyekUpdate;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment.FragmentPenggalangan;
import com.example.invuya.RiwayatFragment.FragmentProyekberjalan;
import com.example.invuya.RiwayatFragment.FragmentProyekselesai;
import com.example.invuya.RiwayatFragment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class DalamRiwayat2 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;
    private TabLayout tabLayout2;
    private ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_riwayat2);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        tabLayout2 = findViewById(R.id.tablayout_id2);
        viewPager2 = findViewById(R.id.viewpager_id2);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPenggalangan2(), "Masa Penggalangan");
        adapter.AddFragment(new FragmentProyekberjalan2(), "Proyek Berjalan");
        adapter.AddFragment(new FragmentProyekselesai2(), "Proyek Selesai");

        viewPager2.setAdapter(adapter);
        tabLayout2.setupWithViewPager(viewPager2);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DalamRiwayat2.this, Home2.class);
                startActivity(intent);
            }
        });
    }
}
