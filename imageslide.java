package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.eventplanner.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class imageslide extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.serinareco,R.drawable.mariotrec,R.drawable.courtrec,R.drawable.venuehabb,R.drawable.jasminemarriagehall,R.drawable.mashallahmarriagehall,R.drawable.asianrestrutrant,R.drawable.monalrestrutrant};
    SliderAdp sliderAdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageslide);
        sliderView=findViewById(R.id.sliderview);
        sliderAdp = new SliderAdp(images);
        sliderView.setSliderAdapter(sliderAdp);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }
}