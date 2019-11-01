package com.example.fragment29072019;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // truy van vao activity
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        // containerViewId: la noi truy xuat view
        // fragment: la noi muon dua fragment minh muon hien thi vao
        fragmentTransaction.add(R.id.linearContainer, androidFragment);
        fragmentTransaction.commit();
    }
}
