package com.example.invuya.TransferBank.BankBNI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invuya.Intent.Home.Home2;
import com.example.invuya.KonfirmasiPembayaran.KonfirmasiLele;
import com.example.invuya.R;

public class BankbniActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_bni);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankbniActivity.this, KonfirmasiLele.class);
                startActivity(intent);
            }
        });
    }

    public void pindahhome2(View view) {
        Intent intent = new Intent(BankbniActivity.this, Home2.class);
        startActivity(intent);
    }
}
