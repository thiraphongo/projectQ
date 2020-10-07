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

public class SecondActivity16 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity16);
        ImageButton next = (ImageButton) findViewById(R.id.img40);
        ImageButton next2 = (ImageButton) findViewById(R.id.img9);
        ImageButton next3 = (ImageButton) findViewById(R.id.img11);
        ImageButton next4 = (ImageButton) findViewById(R.id.img19);
        ImageButton next5 = (ImageButton) findViewById(R.id.img21);
        ImageButton next6 = (ImageButton) findViewById(R.id.img24);
        ImageButton next7 = (ImageButton) findViewById(R.id.img28);
        ImageButton next8 = (ImageButton) findViewById(R.id.img30);
        ImageButton next9 = (ImageButton) findViewById(R.id.img31);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity2.class);
                startActivity(i);
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity3.class);
                startActivity(i);
            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity4.class);
                startActivity(i);
            }
        });

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity5.class);
                startActivity(i);
            }
        });

        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity6.class);
                startActivity(i);
            }
        });

        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity8.class);
                startActivity(i);
            }
        });

        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity9.class);
                startActivity(i);
            }
        });

        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity16.this, SecondActivity10.class);
                startActivity(i);
            }
        });


    }
}
