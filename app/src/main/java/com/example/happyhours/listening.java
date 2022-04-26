package com.example.happyhours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class listening extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

    }

    public void englishlofi(View view) {
        gotoUrl("https://youtu.be/8wKRURAxwyw");
    }

    public void arrehman(View view) {
        gotoUrl("https://youtu.be/_Or4pg-N58M");
    }

    public void english(View view) {
        gotoUrl("https://youtu.be/5mFTXbZzOAE");
    }

    public void bollywood(View view) {
        gotoUrl("https://youtu.be/q_FJGihX2ow");
    }

    public void atifaslam(View view) {
        gotoUrl("https://youtu.be/k_ZNTA1SQ2M");
    }

    public void arijitsingh(View view) {
        gotoUrl("https://youtu.be/0s10Trf8u9w");
    }

    public void rahat(View view) {
        gotoUrl("https://youtu.be/CBVJTplw4cE");
    }

    public void jubin(View view) {
        gotoUrl("https://youtu.be/TDHYP0N44hg");
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}