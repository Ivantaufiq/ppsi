package com.example.invuya.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import com.example.invuya.Entitas.Account;

public class AccountDB extends SQLiteOpenHelper {

    private static String dbName = "admin.db";
    private static String tableName = "account";
    private static String idColumn = "id";
    private static String namaColumn = "nama";
    private static String passwordColumn = "password";
    private static String emailColumn = "email";
    private static String nikColumn = "nik";

    private static int DATABASE_VERSION = 1;

    public AccountDB(Context context){
        super(context, dbName, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + tableName + "(" +
                idColumn + " integer primary key autoincrement, " +
                emailColumn + " text not null ," +
                passwordColumn + " text not null, " +
                namaColumn +" text not null," +
                nikColumn + " integer " +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        onCreate(sqLiteDatabase);
    }

    public void pilihemail(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM account ", null);
        textView.setText("");
        while (cursor.moveToNext()){
            textView.append(cursor.getString(1));
        }
    }

    public boolean create(Account account){
        boolean result = true;
        try {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(namaColumn, account.getNama());
            contentValues.put(passwordColumn, account.getPassword());
            contentValues.put(emailColumn, account.getEmail());
            result = sqLiteDatabase.insert(tableName, null, contentValues) > 0;
        }catch (Exception e){
            result = false;
        }
        return result;
    }

    public Account login(String email, String password){
        Account account = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cursor = sqLiteDatabase.rawQuery(" select * from " + tableName + " where email = ? and password = ?",
                    new String[]{email, password});
            if (cursor.moveToFirst()){
                account = new Account();
                account.setId(cursor.getInt(0));
                account.setNama(cursor.getString(1));
                account.setPassword(cursor.getString(2));
                account.setEmail(cursor.getString(3));
            }
        }catch (Exception e){
            account = null;
        }
        return account;
    }

    public Account checkEmail(String email){
        Account account = null;
        try {
            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
            Cursor cursor = sqLiteDatabase.rawQuery(" select * from " + tableName + " where email = ? ",
                    new String[]{email});
            if (cursor.moveToFirst()){
                account = new Account();
                account.setId(cursor.getInt(0));
                account.setNama(cursor.getString(1));
                account.setPassword(cursor.getString(2));
                account.setEmail(cursor.getString(3));
            }
        }catch (Exception e){
            account = null;
        }
        return account;
    }
}
