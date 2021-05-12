package com.example.myfragmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment;
    Q1Fragment q1Fragment;
    Q2Fragment q2Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        q1Fragment = new Q1Fragment();
        q2Fragment = new Q2Fragment();
    }

    public void showTest(int index) {
        if (index == 0){
            Toast.makeText(this, "1번 문제로 이동합니다.", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, q1Fragment).commit();
        } else if (index == 1){
            Toast.makeText(this, "2번 문제로 이동합니다.", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, q2Fragment).commit();
        } else if (index == 2) {
            Toast.makeText(this, "메인으로 이동합니다.", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        }
    }

    public void answerView(boolean b){
        if (b == true){
            Toast.makeText(this, "정답입니다.", Toast.LENGTH_SHORT).show();
        } else if (b == false){
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }
    }
}