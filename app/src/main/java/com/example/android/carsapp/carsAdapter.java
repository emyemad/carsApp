package com.example.android.carsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class carsAdapter extends BaseAdapter {

    Context context;
    int [] carImg;
    String [] carname;

    public carsAdapter(Context context , int[] carImg , String[] carname ) {
        super();
        this.carImg = carImg;
        this.carname = carname;
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View v = View.inflate(context , R.layout.cars_layout ,null);

        ImageView imageView = v.findViewById(R.id.imgGrid);
        imageView.setImageResource(position);

        TextView textView = v.findViewById(R.id.txtGrid);
        textView.setText(position);

       return v;
    }
}
