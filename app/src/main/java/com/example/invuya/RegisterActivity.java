package com.example.invuya;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.invuya.Database.AccountDB;
import com.example.invuya.Entitas.Account;

public class RegisterActivity extends AppCompatActivity {
    EditText txtnama, txtemail, txtpassword, txtkpass;
    Button btndaftar, btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtemail = findViewById(R.id.txtemail);
        txtnama = findViewById(R.id.txtnama);
        txtpassword = findViewById(R.id.txtpassword);
        btndaftar = findViewById(R.id.btndaftar);
        btnkembali = findViewById(R.id.btnkembali);
        txtkpass = findViewById(R.id.konfirmasipass);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtemail.length() == 0){
                    txtemail.setError("Email Tidak Boleh Kosong");
                }else if (txtpassword.length() == 0){
                    txtpassword.setError("Password Tidak Boleh Kosong");
                }else {
                    btndaftar_onClick(view);
                }
            }
        });

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void btndaftar_onClick(View view) {
        try {
            AccountDB accountDB = new AccountDB(getApplicationContext());
            Account account = new Account();
            account.setEmail(txtemail.getText().toString());
            account.setNama(txtnama.getText().toString());
            account.setPassword(txtpassword.getText().toString());
            Account temp = accountDB.checkEmail(txtemail.getText().toString());

            if (temp == null) {
                if (accountDB.create(account)) {
                    Toast.makeText(RegisterActivity.this,"Berhasil Mendaftar",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setTitle(R.string.error);
                    builder.setMessage(R.string.can_not_create);
                    builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle(R.string.error);
                builder.setMessage(R.string.emailexists);
                builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
            }
        }catch (Exception e){
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            builder.setTitle(R.string.error);
            builder.setMessage(e.getMessage());
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        }
    }
}