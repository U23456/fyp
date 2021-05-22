package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dhiltonmarriagehall extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhiltonmarriagehall);
        payment=(ImageView)findViewById(R.id.paymentcon);
        location=(ImageView) findViewById(R.id.loccon);
        details=(ImageView) findViewById(R.id.dhil);
        phone=(ImageView) findViewById(R.id.phonec);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dhiltonmarriagehall.this,com.Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dhiltonmarriagehall.this,com.hiltonloc.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(dhiltonmarriagehall.this,com.detailhilton.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dhiltonmarriagehall.this,com.hiltonphonenumber.class);
                startActivity(i);
            }
        });
    }
}