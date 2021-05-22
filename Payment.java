package com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.eventplanner.R;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Payment extends AppCompatActivity implements PaymentResultListener {
    Button btPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btPay = (Button)findViewById(R.id.bt_pay);
        String sAmount = "100";
        final int amount = Math.round(Float.parseFloat(sAmount) * 100);
        btPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Checkout checkout = new Checkout();
                checkout.setKeyID("rzp_test_O1vrDqDTmitjmk");
                checkout.setImage(R.drawable.rzp_logo);
                JSONObject object = new JSONObject();
                //Put name
                try {
                    object.put("name","Android Coading");
                    object.put("description","Test Payment");
                    object.put("theme.color","#0093DD");
                    object.put("currency","INR");
                    object.put("amount",amount);
                    object.put("prefill.contact","9876543210");
                    object.put("prefill.email","androidcoding@rzp.com");
                    checkout.open(com.Payment.this,object);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    @Override
    public void onPaymentSuccess(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Payment ID");
        builder.setMessage(s);
        builder.show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();

    }
}