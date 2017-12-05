package com.example.fobro.timemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startList(View view) {
        Intent intent = new Intent(this, ListOfApps.class);
        startActivity(intent);
    }
    public void startSummary(View view) {
        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
    }
    public void startSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
