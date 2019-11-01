package com.example.fragment29072019;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {


    public AndroidFragment() {
        // Required empty public constructor
    }

    // phuong thuc onCreatView dung de set up giao dien vao onCreate
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_android, container, false);
    }

}
