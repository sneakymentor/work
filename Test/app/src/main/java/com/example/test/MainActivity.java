package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent moveIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpToSecondActivity(View view) {
             moveIntent = new Intent( this, Main2Activity.class);
            moveIntent.putExtra("key1","where are you");
            startActivity(moveIntent);



    }
}
