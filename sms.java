package com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eventplanner.R;

public class sms extends AppCompatActivity {
    EditText etphone,etmessage,etaddress;
    Button bt_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        etphone=(EditText)findViewById(R.id.et_phone);
        etmessage=(EditText)findViewById(R.id.et_message);
        bt_send=(Button) findViewById(R.id.bt_send);
        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(com.sms.this, Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
                    sendMessage();
                }
                else {
                    ActivityCompat.requestPermissions(com.sms.this,new String[]{Manifest.permission.SEND_SMS},100 );
                }
            }
        });
    }

    private void sendMessage() {
        String sPhone = etphone.getText().toString().trim();
        String sMessage = etmessage.getText().toString().trim();
        if(!sPhone.equals("")&&!sMessage.equals("")){
            SmsManager smsManager =SmsManager.getDefault();
            smsManager.sendTextMessage(sPhone,null,sMessage,null,null);
            Toast.makeText(getApplicationContext(),"Booking sucessfully!",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Enter the value first",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==100 && grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
            sendMessage();
        }else {
            Toast.makeText(getApplicationContext(),"Permission Denied!",Toast.LENGTH_SHORT).show();
        }
    }
}