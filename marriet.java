package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eventplanner.R;

public class marriet extends AppCompatActivity {
    Button button,button2,buton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriet);
        button = (Button)findViewById(R.id.bt_call);
        button2 =(Button) findViewById(R.id.loc);
        buton3 =(Button) findViewById(R.id.bt_rew);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.marriet.this,com.Phone.class);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.marriet.this,com.Mapsconti.class);
                startActivity(i);
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.marriet.this,com.Rewarded.class);
                startActivity(i);
            }
        });

    }
}