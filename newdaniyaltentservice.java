package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class newdaniyaltentservice extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newdaniyaltentservice);
        payment=(ImageView)findViewById(R.id.paymentnewdaniyal);
        location=(ImageView) findViewById(R.id.locdaniyal);
        details=(ImageView) findViewById(R.id.detailsdaniyal);
        phone=(ImageView) findViewById(R.id.phonedaniyal);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.newdaniyaltentservice.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.newdaniyaltentservice.this,com.locdaniyal.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.newdaniyaltentservice.this,com.detaildaniyal.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.newdaniyaltentservice.this,com.keyanirestrutrant.class);
                startActivity(i);
            }
        });
    }
}