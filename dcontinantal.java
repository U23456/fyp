package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dcontinantal extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcontinantal);
        payment=(ImageView)findViewById(R.id.paymentcon);
        location=(ImageView) findViewById(R.id.loccon);
        details=(ImageView) findViewById(R.id.drtcon);
        phone=(ImageView) findViewById(R.id.phonec);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcontinantal.this,com.paymentt.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dcontinantal.this,com.example.eventplanner.contiloc.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcontinantal.this,com.detailcontinantal.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcontinantal.this,com.pofnumber.class);
                startActivity(i);
            }
        });


    }
}