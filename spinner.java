package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.eventplanner.R;

public class spinner extends AppCompatActivity  {
    Spinner cityNames;
    String[] city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        cityNames=(Spinner)findViewById(R.id.myvenuespinner);
        city=getResources().getStringArray(R.array.locations);
        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_spinner_item,city);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        cityNames.setAdapter(adapter);
        cityNames.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(spinner.this,city[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





}}
