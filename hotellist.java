package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class hotellist extends AppCompatActivity {
    ImageView pof,continantal,lahorepalace,saimabuckethall,moven,hiltommarriagehall,mashallmarriagehall,cityhallqutta,serina,marriethall,paradise,millaianmarriagehall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotellist);
        pof=(ImageView)findViewById(R.id.hpof);
        continantal=(ImageView) findViewById(R.id.hcontinantal);
        lahorepalace=(ImageView) findViewById(R.id.hlahorepalace);
        mashallmarriagehall=(ImageView) findViewById(R.id.mashhallah);
        cityhallqutta=(ImageView) findViewById(R.id.cituhallquetta);

        moven=(ImageView)findViewById(R.id.movenpick);


        marriethall=(ImageView) findViewById(R.id.marriethotel);


        hiltommarriagehall=(ImageView) findViewById(R.id.hiltonmarriagehall);




        pof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.hotellist.this,com.dpof.class);
                startActivity(i);
            }
        });
        continantal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.hotellist.this,com.dcontinantal.class);
                startActivity(i);

            }
        });
        lahorepalace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dcityhallquetta.class);
                startActivity(i);
            }
        });


        cityhallqutta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dcityhallquett.class);
                startActivity(i);
            }
        });
        marriethall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dmarriet.class);
                startActivity(i);
            }
        });



        hiltommarriagehall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dhiltonmarriagehall.class);
                startActivity(i);
            }
        });
        mashallmarriagehall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dmashallahmarriagehall.class);
                startActivity(i);
            }
        });
        moven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.hotellist.this,com.dmoven.class);
                startActivity(i);

            }
        });

    }
}