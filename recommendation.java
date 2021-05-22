package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.eventplanner.R;
import com.hsalf.smilerating.SmileRating;


import java.util.ArrayList;
import java.util.List;

public class recommendation extends AppCompatActivity {
    TextView rateCount, showRatting;
    EditText review;
    Button submit;
    RatingBar ratingBar;
    float rateValue; String temp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
        rateCount= findViewById(R.id.ratecount);
        ratingBar=findViewById(R.id.rattingbar);
        review =findViewById(R.id.review);
        submit=findViewById(R.id.submitbutton);
        showRatting=findViewById(R.id.showratting);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rateValue = ratingBar.getRating();
                if(rateValue<=1 && rateValue>0)
                    rateCount.setText("Bad" +rateValue +"/5");
                else if(rateValue<=2 && rateValue>1){
                rateCount.setText("Ok" +rateValue +"/5");
                }
                else if(rateValue<=3 && rateValue>2) {
                    rateCount.setText("Good" + rateValue + "/5");
                }
                else if(rateValue<=4 && rateValue>3) {
                    rateCount.setText("Very Good" + rateValue + "/5");
                }
                else if(rateValue<=5 && rateValue>5) {
                    rateCount.setText("Best" + rateValue + "/5");
                }



            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = rateCount.getText().toString();
                showRatting.setText("your rattig:\n"+temp+"\n"+review.getText());
                review.setText("");
                ratingBar.setRating(0);
                rateCount.setText("");
            }
        });


    }


}