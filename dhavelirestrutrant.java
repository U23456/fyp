package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dhavelirestrutrant extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhavelirestrutrant);
        payment=(ImageView)findViewById(R.id.paymenthavei);
        location=(ImageView) findViewById(R.id.lochavi);
        details=(ImageView) findViewById(R.id.detailshavi);
        phone=(ImageView) findViewById(R.id.phonehavi);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dhavelirestrutrant.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dhavelirestrutrant.this,com.lochaveli.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dhavelirestrutrant.this,com.detailhaveli.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dhavelirestrutrant.this,com.phonehavelirestrutrant.class);
                startActivity(i);
            }
        });
    }
}
