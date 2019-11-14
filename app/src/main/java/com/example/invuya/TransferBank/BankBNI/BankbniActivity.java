package com.example.invuya.TransferBank.BankBNI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.invuya.Home2;
import com.example.invuya.Pembayaran.PembayaranLele;
import com.example.invuya.R;

public class BankbniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_bni);
    }

    public void pindahhome2(View view) {
        Intent intent = new Intent(BankbniActivity.this, Home2.class);
        startActivity(intent);
    }
}
