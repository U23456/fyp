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
import android.widget.Toast;

import com.example.eventplanner.R;

public class phonemezban extends AppCompatActivity {
    EditText txt_phonenumber;
    Button btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonemezban);
        txt_phonenumber=(EditText)findViewById(R.id.txt_number);
        btn_call=(Button)findViewById(R.id.btn_call);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                String number = txt_phonenumber.getText().toString();
                if(number.trim().isEmpty()){
                    Toast.makeText(com.phonemezban.this,"Please Enter Your Number",Toast.LENGTH_SHORT);
                }
                else {
                    intentCall.setData(Uri.parse("tel:"+number));
                }
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(com.phonemezban.this,"Please Grant permission",Toast.LENGTH_SHORT);
                    requestPermission();
                }
                else {
                    startActivity(intentCall);
                }


            }


        });


    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(com.phonemezban.this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
}