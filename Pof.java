package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eventplanner.R;

public class Pof extends AppCompatActivity {
    Button button,button1,button2,chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pof);
        button =(Button)findViewById(R.id.bt_call);
        button1 =(Button) findViewById(R.id.bt_rew);
        button2 =(Button) findViewById(R.id.loc);
        chat =(Button) findViewById(R.id.mp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(com.Pof.this,com.Phone.class);
                startActivity(i);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.Pof.this,com.Rewarded.class);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.Pof.this,com.locpof.class);
                startActivity(i);
            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.Pof.this,com.example.eventplanner.usmans.class);
                startActivity(i);
            }
        });

    }
}