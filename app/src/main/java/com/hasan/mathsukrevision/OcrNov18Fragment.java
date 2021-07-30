package com.hasan.mathsukrevision;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OcrNov18Fragment extends Fragment {

    private Button btn_paper1, btn_paper2, btn_paper3;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ocr_nov18, container, false);

        btn_paper1 = (Button) view.findViewById(R.id.btn_o_nov18_1);
        btn_paper2 = (Button) view.findViewById(R.id.btn_o_nov18_2);
        btn_paper3 = (Button) view.findViewById(R.id.btn_o_nov18_3);

        btn_paper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), OcrNov18Paper1.class);
                startActivity(i);
            }
        });

        btn_paper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), OcrNov18Paper2.class);
                startActivity(i);
            }
        });

        btn_paper3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), OcrNov18Paper3.class);
                startActivity(i);
            }
        });

        return view;
    }
}