package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dlahorepalace extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlahorepalace);
        payment=(ImageView)findViewById(R.id.paymentlah);
        location=(ImageView) findViewById(R.id.loclah);
        details=(ImageView) findViewById(R.id.dlah);
        phone=(ImageView) findViewById(R.id.phonelah);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dlahorepalace.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dlahorepalace.this,com.localarros.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dlahorepalace.this,com.detailspof1.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dlahorepalace.this,com.phonealaroos.class);
                startActivity(i);
            }
        });


    }
}