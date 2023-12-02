package com.example.taxiapp.includes;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taxiapp.R;

public class Mytoolbar {

    static public void show(AppCompatActivity activity, String title, boolean upButton) {
        androidx.appcompat.widget.Toolbar toolbar = activity.findViewById(R.id.toolbar);
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle(title);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
