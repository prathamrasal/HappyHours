package com.example.happyhours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switch_to_reading(View view){
        Intent intent = new Intent(this, reading.class);
        startActivity(intent);
    }

    public void switch_to_memes(View view){
        Intent intent = new Intent(this, memes.class);
        startActivity(intent);
    }

    public void switch_to_listening(View view){
        Intent intent = new Intent(this, listening.class);
        startActivity(intent);
    }

    public void switch_to_videos(View view){
        Intent intent = new Intent(this, videos.class);
        startActivity(intent);
    }
}