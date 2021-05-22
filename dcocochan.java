package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dcocochan extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcocochan);
        payment=(ImageView)findViewById(R.id.paymencoco);
        location=(ImageView) findViewById(R.id.loccoco);
        details=(ImageView) findViewById(R.id.detailcoco);
        phone=(ImageView) findViewById(R.id.phonecoco);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcocochan.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dcocochan.this,com.lococococham.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcocochan.this,com.detailcocochan.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcocochan.this,com.phonecocochan.class);
                startActivity(i);
            }
        });
    }
}