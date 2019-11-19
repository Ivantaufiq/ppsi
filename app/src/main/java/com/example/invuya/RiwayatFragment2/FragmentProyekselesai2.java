package com.example.invuya.RiwayatFragment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.invuya.KonfirmasiPembayaran.KonfirmasiNila;
import com.example.invuya.R;

public class FragmentProyekselesai2 extends Fragment {
    View view;

    public FragmentProyekselesai2(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_proyekselesai2, container, false);
        return view;

    }
}
