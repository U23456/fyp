package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class dcityhallquett extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcityhallquett);
        payment=(ImageView)findViewById(R.id.paymentqeu);
        location=(ImageView) findViewById(R.id.locque);
        details=(ImageView) findViewById(R.id.drtcityd);
        phone=(ImageView) findViewById(R.id.phonequu);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcityhallquett.this,com.paymentt.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dcityhallquett.this,com.loccityhallqe.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcityhallquett.this,com.detailcityhall.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dcityhallquett.this,com.Phonecityh.class);
                startActivity(i);
            }
        });
    }
}