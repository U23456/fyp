package com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.eventplanner.R;

public class dalaroosmarriagehall extends AppCompatActivity {
    ImageView payment,location,details,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalaroosmarriagehall);
        payment=(ImageView)findViewById(R.id.paymentalaroos);
        location=(ImageView) findViewById(R.id.localaroos);
        details=(ImageView) findViewById(R.id.detalaroos);
        phone=(ImageView) findViewById(R.id.phonalaroos);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dalaroosmarriagehall.this,Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.dalaroosmarriagehall.this,com.loclahorepalce.class);
                startActivity(i);
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dalaroosmarriagehall.this,com.detailspof1.class);
                startActivity(i);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.dalaroosmarriagehall.this,com.lahoreplacephone.class);
                startActivity(i);
            }
        });


    }
}