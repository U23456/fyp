package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dokara extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokara);
        payment=(ImageView)findViewById(R.id.phonesokara);
        location=(ImageView) findViewById(R.id.locmokara);
        details=(ImageView) findViewById(R.id.detailsokara);
        phone=(ImageView) findViewById(R.id.phonesokara);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dokara.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dokara.this,com.locokara.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dokara.this,com.detailokara.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dokara.this,com.phoneokara.class);
                startActivity(i);
            }
        });
    }
    }
