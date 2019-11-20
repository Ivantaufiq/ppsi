package com.example.invuya.RiwayatFragment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.invuya.Intent.IkanLeleRiwayat;
import com.example.invuya.R;

public class FragmentProyekselesai3 extends Fragment {
    View view;

    public FragmentProyekselesai3(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_proyekselesai3, container, false);
        return view;

    }
}
