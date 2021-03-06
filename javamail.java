package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eventplanner.R;

import javax.mail.Message;
import javax.security.auth.Subject;

public class javamail extends AppCompatActivity {
    EditText mRecipient,mSubject,mMessage;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javamail);
        mRecipient=findViewById(R.id.recepintid);
        mSubject=findViewById(R.id.subject);
        mMessage=findViewById(R.id.messageet);
        sendEmail=findViewById(R.id.sendemail);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recipient = mRecipient.getText().toString().trim();
                String subject = mSubject.getText().toString().trim();
                String message = mMessage.getText().toString().trim();
                sendEmail(recipient, subject ,message);
            }
        });
    }

    private void sendEmail(String recipient, String subject, String message) {
        Intent mEmailIntent = new Intent(Intent.ACTION_SEND);
        mEmailIntent.setData(Uri.parse("mail to:"));
        mEmailIntent.setType("text/plain");
        mEmailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{recipient});
        mEmailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        mEmailIntent.putExtra(Intent.EXTRA_TEXT, message);
        try {
            startActivity(Intent.createChooser(mEmailIntent,"chose an email client"));

        }
        catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}