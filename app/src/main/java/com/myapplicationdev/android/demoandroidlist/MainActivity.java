package com.myapplicationdev.android.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;
    //ArrayAdapter<AndroidVersion> aaAndroid;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);

        androidList = new ArrayList<>();

        // Store value into object with the AndroidVersion Objects
        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow","6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop","5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat","4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean","4.1 - 4.3.1");

        // Add the items in
        androidList.add(item1);
        androidList.add(item2);
        androidList.add(item3);
        androidList.add(item4);
        androidList.add(item5);
        androidList.add(item6);
        androidList.add(item7);

        //aaAndroid = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, androidList);
        adapter = new CustomAdapter(this,R.layout.row,androidList);

        lvAndroid.setAdapter(adapter);
    }
}
