package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eventplanner.R;

public class wedding extends AppCompatActivity {
    Button POFHotel,Continental,Marriet,Marhaba,MargalaHotel,Ordanance,Topaz,Movenpick,SerenaHotel,Hiltonmerriage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);
        POFHotel=(Button)findViewById(R.id.btn_pof);
        Continental=(Button)findViewById(R.id.btn_conti);
        Marriet=(Button)findViewById(R.id.mar);
        Marhaba=(Button)findViewById(R.id.Mar);
        MargalaHotel=(Button)findViewById(R.id.margala);
        Ordanance=(Button)findViewById(R.id.club);
        Topaz=(Button)findViewById(R.id.topaz);
        Movenpick=(Button)findViewById(R.id.movenpick);
        SerenaHotel=(Button)findViewById(R.id.serina);
        Hiltonmerriage=(Button)findViewById(R.id.hilton);
        POFHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.Pof.class);
                startActivity(i);
            }
        });
        Continental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.wahconti.class);
                startActivity(i);
            }
        });
        Marriet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.marriet.class);
                startActivity(i);
            }
        });
        Marhaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.Marhaba.class);
                startActivity(i);
            }
        });
        Ordanance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.ordanance.class);
                startActivity(i);
            }
        });
        Topaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.Topaz.class);
                startActivity(i);
            }
        });
        Movenpick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.Movenpick.class);
                startActivity(i);
            }
        });
        SerenaHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.serina.class);
                startActivity(i);
            }
        });
        MargalaHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.wedding.this,com.Margala.class);
                startActivity(i);
            }
        });

    }
}