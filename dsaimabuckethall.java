package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dsaimabuckethall extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsaimabuckethall);
        payment=(ImageView)findViewById(R.id.paymentsamima);
        location=(ImageView) findViewById(R.id.locsamima);
        details=(ImageView) findViewById(R.id.detailssamima);
        phone=(ImageView) findViewById(R.id.phonesamima);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsaimabuckethall.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dsaimabuckethall.this,com.locsamimabuckethall.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsaimabuckethall.this,com.detailsamimabucket.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsaimabuckethall.this,com.Phonesamima.class);
                startActivity(i);
            }
        });
    }
}