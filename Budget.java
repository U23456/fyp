package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eventplanner.R;

public class Budget extends AppCompatActivity {
    EditText num1, num2,num3,num4;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);

        result = findViewById(R.id.result);
        TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!num1.getText().toString().equals("") && !num2.getText().toString().equals("")&& !num3.getText().toString().equals("")&&!num4.getText().toString().equals("") ){
                    int temp1 = Integer.parseInt(num1.getText().toString());
                    int temp2 = Integer.parseInt(num2.getText().toString());
                    int temp3 = Integer.parseInt(num3.getText().toString());
                    int temp4 = Integer.parseInt(num4.getText().toString());

                    result.setText(String.valueOf(temp1-temp2/temp3*temp4));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        num1.addTextChangedListener(textWatcher);
        num2.addTextChangedListener(textWatcher);
        num3.addTextChangedListener(textWatcher);
        num4.addTextChangedListener(textWatcher);


    }
}