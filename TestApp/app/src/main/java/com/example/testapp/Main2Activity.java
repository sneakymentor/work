package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editValue ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editValue = findViewById(R.id.poewr);
        editValue.setText(getIntent().getStringExtra("key1"));
    }



    }

