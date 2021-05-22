package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.eventplanner.R;

public class feedback extends AppCompatActivity {
    private Firebase Ref;
    private EditText username,feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        username=(EditText)findViewById(R.id.username);
        feedback=(EditText)findViewById(R.id.feedback);
        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://feedback-63ae5-default-rtdb.firebaseio.com/");
    }

    public void feedbacksent(View view) {
        String usernameinput=username.getText().toString();
        String feedbackinput=feedback.getText().toString();
        Firebase Reusername=Ref.child("feedback");
        Reusername.setValue(usernameinput);
    }
}