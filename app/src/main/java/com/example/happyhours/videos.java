package com.example.happyhours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
    }

    public void college(View view) {
        gotoUrl("https://youtu.be/i5YNZiz2GWY");
    }

    public void corporateLife(View view) {
        gotoUrl("https://youtu.be/zUHhwS0jw3s");
    }

    public void friends(View view) {
        gotoUrl("https://youtu.be/nvzkHGNdtfk");
    }

    public void zakir(View view) {
        gotoUrl("https://youtu.be/in4RXMJlEVk");
    }
    public void bassi(View view) {
        gotoUrl("https://youtu.be/Tqsz6fjvhZM");
    }
    public void sudeepSharma(View view) {
        gotoUrl("https://youtu.be/LfgJWr-SGxQ");
    }

    public void classmates(View view) {
        gotoUrl("https://youtu.be/vccwHvCIuW8");
    }

    public void backbenchers(View view) {
        gotoUrl("https://youtu.be/XOZlzJGGrgU");
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}