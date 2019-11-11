package com.example.invuya.Profil.InformasiAkun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.invuya.Database.AccountDB;
import com.example.invuya.R;

public class InfoEmailActivity extends AppCompatActivity {
    TextView textemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_email);

        textemail = findViewById(R.id.textemail);

    }
}
