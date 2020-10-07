package com.example.projectq;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Context;


public class SecondActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity11);
        ImageButton next = (ImageButton) findViewById(R.id.img40);
        ImageButton next2 = (ImageButton) findViewById(R.id.img45);
        ImageButton next3 = (ImageButton) findViewById(R.id.img48);
        ImageButton next4 = (ImageButton) findViewById(R.id.img52);
        ImageButton next5 = (ImageButton) findViewById(R.id.img55);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity11.this, SecondActivity5.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity11.this, SecondActivity6.class);
                startActivity(i);
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity11.this, SecondActivity7.class);
                startActivity(i);
            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity11.this, SecondActivity8.class);
                startActivity(i);
            }
        });

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity11.this, SecondActivity9.class);
                startActivity(i);
            }
        });
    }
}