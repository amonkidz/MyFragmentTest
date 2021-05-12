package com.example.myfragmenttest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class Q2Fragment extends Fragment {

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_q2, container, false);

        checkBox1 = rootView.findViewById(R.id.Q2_1checkbox);
        checkBox2 = rootView.findViewById(R.id.Q2_2checkbox);
        checkBox3 = rootView.findViewById(R.id.Q2_3checkbox);
        checkBox4 = rootView.findViewById(R.id.Q2_4checkbox);

        Button button1 = rootView.findViewById(R.id.Q2quit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check1 = checkBox1.isChecked();
                boolean check2 = checkBox2.isChecked();
                boolean check3 = checkBox3.isChecked();
                boolean check4 = checkBox4.isChecked();

                MainActivity mainActivity = (MainActivity) getActivity();
                if(check3 == true && checkBox1.isChecked() == false && checkBox2.isChecked() == false && checkBox4.isChecked() == false) {
                    mainActivity.answerView(true);
                } else {
                    mainActivity.answerView(false);
                }
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
            }
        });

        Button button2 = rootView.findViewById(R.id.Maingo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.showTest(2);
            }
        });

        return rootView;
    }
}