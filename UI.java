package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eventplanner.ratingstar;



import com.example.eventplanner.R;

public class UI extends AppCompatActivity {
    Button wedding,Restruant,TentService,Location,Budget,Gmail,Phone,Payment,ads,recommendation,ratingstar,instruction;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i);

        wedding=(Button)findViewById(R.id.btn_wedding);
        Restruant=(Button)findViewById(R.id.btn_res);
        TentService=(Button)findViewById(R.id.btn_tent);
        Location=(Button)findViewById(R.id.btn_location);
        Budget=(Button)findViewById(R.id.btn_bud);
        Gmail=(Button)findViewById(R.id.btn_gmail);
        Phone=(Button)findViewById(R.id.btn_phone);
        Payment=(Button)findViewById(R.id.btn_pay);
        ads=(Button) findViewById(R.id.ads);
        ratingstar=(Button) findViewById(R.id.rat);
        recommendation=(Button) findViewById(R.id.res);
        instruction=(Button)findViewById(R.id.btn_ins);
        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.hotellist.class);
                startActivity(i);

            }
        });
        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Location.class);
                startActivity(i);
            }
        });

        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        Budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.UI.this,com.example.eventplanner.Bud.class);
                startActivity(i);
            }
        });
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.phonehavelirestrutrant.class);
                startActivity(i);
            }
        });
        Gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.javamail.class);
                startActivity(i);
            }
        });
       


       ratingstar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this, com.recommendation.class);
               startActivity(i);
           }
       });

       Restruant.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.restrutrant.class);
               startActivity(i);
           }
       });
       TentService.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.tentservice.class);
               startActivity(i);
           }
       });
       recommendation.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.qrcode.class);
               startActivity(i);
           }
       });

       ads.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.admmb.class);
               startActivity(i);
           }
       });

       instruction.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.videov.class);
               startActivity(i);
           }
       });





    }
}