package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.eventplanner.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class dcontinatal extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.rt,R.drawable.tyyu,R.drawable.wa};
    SliderAdp sliderAdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcontinatal);
        sliderView=findViewById(R.id.sliderview);
        sliderAdp = new SliderAdp(images);
        sliderView.setSliderAdapter(sliderAdp);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
}