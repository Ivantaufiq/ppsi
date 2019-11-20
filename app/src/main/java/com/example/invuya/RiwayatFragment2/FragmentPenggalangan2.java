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

import com.example.invuya.Intent.IkanLeleRiwayat;
import com.example.invuya.R;

public class FragmentPenggalangan2 extends Fragment {

    View view;

    public FragmentPenggalangan2(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_penggalangan2, container, false);

        Button btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IkanLeleRiwayat.class);
                startActivity(intent);
            }
        });
        return view;

    }
}
