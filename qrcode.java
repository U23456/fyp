package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eventplanner.R;

public class qrcode extends AppCompatActivity {
    public static TextView resultTextview;
    Button scan_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        resultTextview=(TextView)findViewById(R.id.result_text);
        scan_button=(Button)findViewById(R.id.bt_scan);
        scan_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),scancodeactivity.class));
            }
        });
    }
}