package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dsamimabuckethall extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsamimabuckethall);
        payment=(ImageView)findViewById(R.id.paymentsamima);
        location=(ImageView) findViewById(R.id.locsamima);
        details=(ImageView) findViewById(R.id.drtsam);
        phone=(ImageView) findViewById(R.id.phonesamima);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsamimabuckethall.this,com.paymentt.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dsamimabuckethall.this,com.lochotelembisidor.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsamimabuckethall.this,com.detailsamimabucket.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dsamimabuckethall.this,com.Phonesamima.class);
                startActivity(i);
            }
        });
    }
}