package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class tentservice extends AppCompatActivity {
    ImageView hanif,pakistan,hadery,mezban,newdaniyal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentservice);
        hanif=(ImageView)findViewById(R.id.hres);
        pakistan=(ImageView)findViewById(R.id.cat);
        hadery=(ImageView)findViewById(R.id.hadery);
        mezban=(ImageView)findViewById(R.id.mezban);
        newdaniyal=(ImageView)findViewById(R.id.daniyal);
        hanif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.tentservice.this,com.dhanifcatering.class);
                startActivity(i);
            }
        });
        pakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.tentservice.this,com.dpakistancatering.class);
                startActivity(i);
            }
        });
        hadery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.tentservice.this,com.dhaderycatering.class);
                startActivity(i);
            }
        });
        mezban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.tentservice.this,com.dmezban.class);
                startActivity(i);
            }
        });
        newdaniyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.tentservice.this,com.newdaniyaltentservice.class);
                startActivity(i);
            }
        });





    }
}