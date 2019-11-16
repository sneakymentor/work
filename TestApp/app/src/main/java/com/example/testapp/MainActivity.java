package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent Hy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void jumpToSecondActivity(View view){
        Hy = new Intent(this,Main2Activity.class);
        Hy.putExtra("key1","how are you");
        startActivity(Hy);

    }

    }



