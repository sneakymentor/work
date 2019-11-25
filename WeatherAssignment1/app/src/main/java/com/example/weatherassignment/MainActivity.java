package com.example.weatherassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.check);
    }


    public void Weather (View view) {
        int num =  Integer Integer.parseInt(getText().toString());

        String hy;

        if(num. =0){
            hy = "Freezing Cold Weather";
        }else if(num <=0){
            hy = "Pleasant Weather";

        }else {
            hy = (num <=0){
                    "Deadly Hot  Weather"
        }
        Toast.makeText(this, "good", Toast.LENGTH_SHORT).show();

    }


}