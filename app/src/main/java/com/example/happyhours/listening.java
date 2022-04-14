package com.example.happyhours;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class listening extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter adapter;
    MediaPlayer Player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

        listView = findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        Field[] fields = R.raw.class.getFields();
        for (int i = 0 ; i<fields.length;i++){
            arrayList.add(fields[i].getName());
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             if (Player!=null){
                 Player.release();
             }
             int resId = getResources().getIdentifier(arrayList.get(i),"raw",getPackageName());
             Player = MediaPlayer.create(listening.this,resId);
                Player.start();
            }
        });
    }
}