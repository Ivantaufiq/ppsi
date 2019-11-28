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

import com.example.invuya.Intent.IkanLeleLaporan;
import com.example.invuya.R;

public class FragmentProyekberjalan3 extends Fragment {
    View view;

    public FragmentProyekberjalan3(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_proyekberjalan3, container, false);
        Button btn2 = (Button) view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IkanLeleLaporan.class);
                startActivity(intent);
            }
        });
        return view;

    }
}
