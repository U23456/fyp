package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class restrutrant extends AppCompatActivity {
    ImageView hungryrestrutrant,meraki,okrarestrutrant,cocochan,haveli,shiraz,keyani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restrutrant);
        hungryrestrutrant=(ImageView)findViewById(R.id.hres);
        meraki=(ImageView)findViewById(R.id.hmer);
        okrarestrutrant=(ImageView)findViewById(R.id.okara);
        cocochan=(ImageView) findViewById(R.id.cocochan);
        haveli=(ImageView) findViewById(R.id.havii);
        shiraz=(ImageView) findViewById(R.id.shiraz);
        keyani=(ImageView) findViewById(R.id.keyani);
        hungryrestrutrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dhuntry.class);
                startActivity(i);
            }
        });
        meraki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dmeraki.class);
                startActivity(i);
            }
        });
        okrarestrutrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dokara.class);
                startActivity(i);
            }
        });
        cocochan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dcocochan.class);
                startActivity(i);
            }
        });
        haveli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dhavelirestrutrant.class);
                startActivity(i);
            }
        });
        shiraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dshiraz.class);
                startActivity(i);
            }
        });
        keyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.restrutrant.this,com.dkeyani.class);
                startActivity(i);

            }
        });
    }
}