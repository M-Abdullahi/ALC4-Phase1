package com.example.phase1challenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button BtnALC;
    protected Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ALC 4 Phase 1");

    }

    public void navigateProfile(View view) {
        Intent profileIntent = new Intent(MainActivity.this, ActivityC.class);
        startActivity(profileIntent);
    }

    public void navigateALC(View view) {
        Intent alcIntent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(alcIntent);
    }

    }

//    public void openAndela(View view) {
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
//        startActivity(browserIntent);
//    }



