package com.example.sharedelementtransition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView raw_image;
    private TextView story_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // these are the shared views
        raw_image = findViewById(R.id.raw_image_imageView);
        story_title = findViewById(R.id.story_title_textView);
    }

    public void openDetailActivity(View view) {
        Intent intent = new Intent(this,DetailActivity.class);

        // creating pair objects
        Pair<View,String> rawImagePair = new Pair<>(raw_image,"change_raw_image_position");
        Pair<View,String> storyTitlePair = new Pair<>(story_title,"change_story_title_position");

        // this will create the animation
        ActivityOptions options = ActivityOptions.
                                        makeSceneTransitionAnimation(
                                                                this,
                                                                        rawImagePair,storyTitlePair);

        startActivity(intent,options.toBundle());     // pass the instance of options as bundle
    }
}