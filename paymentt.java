package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eventplanner.R;

public class paymentt extends AppCompatActivity {
    ImageView bankalfallah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentt);
        bankalfallah=(ImageView)findViewById(R.id.keyani);
        bankalfallah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.paymentt.this,com.Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
    }
}