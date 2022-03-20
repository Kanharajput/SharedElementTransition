package com.example.sharedelementtransition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView raw_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        raw_image = findViewById(R.id.raw_image_imageView);
    }

    public void openDetailActivity(View view) {
        Intent intent = new Intent(this,DetailActivity.class);

        // this will create the animation
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
                                                                                    raw_image,
                                                                    "change_raw_image_position");

        startActivity(intent,options.toBundle());     // pass the instance of options as bundle
    }
}