package com.example.android.carsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class home extends Fragment {
    GridView grid;

    int[] carsImgs = {R.mipmap.car , R.mipmap.car , R.mipmap.car , R.mipmap.car};
    String [] carsNames= {"Hyuondai" , "Toyota " , "Marcedes " , "BMW "};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        grid = v.findViewById(R.id.gridview);

        carsAdapter adapter = new carsAdapter(getActivity() , carsImgs , carsNames);
        grid.setAdapter(adapter);
        return v;
    }


}
