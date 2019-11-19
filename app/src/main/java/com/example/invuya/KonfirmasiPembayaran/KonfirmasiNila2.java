package com.example.invuya.KonfirmasiPembayaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.invuya.Intent.IkanNilaKembali;
import com.example.invuya.R;
import com.example.invuya.ResiActivity;
import com.example.invuya.TransferBank.BankBNI.BankbcaActivity;

public class KonfirmasiNila2 extends AppCompatActivity {
    LinearLayout expandableView;
    Button arrowBtn;
    CardView cardView;
    Toolbar toolbar;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_nila2);
        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);
        toolbar = findViewById(R.id.toolbar);
        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonfirmasiNila2.this, IkanNilaKembali.class);
                startActivity(intent);
            }
        });
    }
    public void konfir1(View view) {
        if (expandableView.getVisibility()==View.GONE){
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.VISIBLE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_blue_24dp);
        } else {
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandableView.setVisibility(View.GONE);
            arrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_blue_24dp);
        }
    }
    public void bankmandiri(View view) {
        Intent intent = new Intent(KonfirmasiNila2.this, ResiActivity.class);
        startActivity(intent);
    }

    public void bankbca(View view) {
        Intent intent = new Intent(KonfirmasiNila2.this, BankbcaActivity.class);
        startActivity(intent);
    }

    public void bankbri(View view) {
        Intent intent = new Intent(KonfirmasiNila2.this, ResiActivity.class);
        startActivity(intent);
    }

    public void bankbni(View view) {
        Intent intent = new Intent(KonfirmasiNila2.this, ResiActivity.class);
        startActivity(intent);
    }
}
