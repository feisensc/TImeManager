package com.example.fobro.timemanager;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.Menu;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfApps extends AppCompatActivity {
    Object[] mArray = new Object[]{"Google Chrome:   42m 29s", "Youtube:   35m 54s",
            "Facebook Messenger:   28m 30s", "Spotify:   22m 5s",
            "Amazon:   21m 43s", "Google Play:   16m 21s", "Angry Birds: 15m 9s",
            "Google Maps:   10m 45s", "Snapchat:   5m 52s","Clock:   0m 45s"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_apps);
        ListView mListView;

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, mArray);

        mListView = (ListView) findViewById(R.id.ListView);
        mListView.setAdapter(adapter);

    }




}
