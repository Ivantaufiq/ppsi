package com.example.invuya.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.HomeActivity;
import com.example.invuya.Intent.Home.HomeDataDiriFix;
import com.example.invuya.R;
import com.example.invuya.RiwayatFragment.FragmentPenggalangan;
import com.example.invuya.RiwayatFragment.FragmentProyekberjalan;
import com.example.invuya.RiwayatFragment.FragmentProyekselesai;
import com.example.invuya.RiwayatFragment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class RiwayatActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentPenggalangan(), "Masa Penggalangan");
        adapter.AddFragment(new FragmentProyekberjalan(), "Proyek Berjalan");
        adapter.AddFragment(new FragmentProyekselesai(), "Proyek Selesai");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RiwayatActivity.this, HomeDataDiriFix.class);
                startActivity(intent);
            }
        });
    }
}
