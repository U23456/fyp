package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dtalipbauckethall extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtalipbauckethall);
        payment=(ImageView)findViewById(R.id.paymenttalip);
        location=(ImageView) findViewById(R.id.loctalip);
        details=(ImageView) findViewById(R.id.dettalip);
        phone=(ImageView) findViewById(R.id.phonestalip);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dtalipbauckethall.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dtalipbauckethall.this,com.loctalip.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dtalipbauckethall.this,com.detailtalip.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dtalipbauckethall.this,com.phonetalip.class);
                startActivity(i);
            }
        });
    }
}