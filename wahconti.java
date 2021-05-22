package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eventplanner.R;

public class wahconti extends AppCompatActivity {
    Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahconti);
        button=(Button)findViewById(R.id.bt_call);
        button1=(Button)findViewById(R.id.bt_rew);
        button2=(Button) findViewById(R.id.loc);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(com.wahconti.this,com.Phone.class);
                        startActivity(i);
                    }
                });
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent i=new Intent(com.wahconti.this,com.Rewarded.class);
                       startActivity(i);
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(com.wahconti.this,com.MapsActivity.class);
                        startActivity(i);
                    }
                });
    }
}