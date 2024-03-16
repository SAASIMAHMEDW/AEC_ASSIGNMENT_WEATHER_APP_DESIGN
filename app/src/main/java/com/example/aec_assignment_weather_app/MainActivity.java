package com.example.aec_assignment_weather_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText weather_city_textview;
    TextView weather_city,weather_time,weather_temp,weather_date;
    ImageView weather_next_page,weather_back_page;
    LinearLayout weather_page_one,weather_page_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializer();
        weather_next_page.setOnClickListener(v -> {
            weather_page_one.setVisibility(View.GONE);
            weather_page_two.setVisibility(View.VISIBLE);
        });
        weather_back_page.setOnClickListener(v -> {
            weather_page_one.setVisibility(View.VISIBLE);
            weather_page_two.setVisibility(View.GONE);
        });
    }
    public void initializer(){
        weather_city_textview = findViewById(R.id.weather_city_textview);
        weather_city = findViewById(R.id.weather_city);
        weather_time = findViewById(R.id.weather_time);
        weather_temp = findViewById(R.id.weather_temp);
        weather_date = findViewById(R.id.weather_date);
        weather_next_page = findViewById(R.id.weather_next_page);
        weather_back_page = findViewById(R.id.weather_back_page);
        weather_page_one = findViewById(R.id.weather_page_one);
        weather_page_two = findViewById(R.id.weather_page_two);
    }
}