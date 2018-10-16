package com.example.android.jokevisualizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeVisualizer extends AppCompatActivity {

    public static String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_visualizer);
        TextView jokeTextView = findViewById(R.id.tv_joke);
        jokeTextView.setText(getIntent().getStringExtra(JOKE_KEY));
    }
}
