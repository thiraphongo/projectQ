package com.example.projectq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Context;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton next = (ImageButton) findViewById(R.id.img8);
        ImageButton next2 = (ImageButton) findViewById(R.id.img9);
        ImageButton next3 = (ImageButton) findViewById(R.id.img10);
        ImageButton next4 = (ImageButton) findViewById(R.id.img17);
        ImageButton next5 = (ImageButton) findViewById(R.id.img20);
        ImageButton next6 = (ImageButton) findViewById(R.id.img29);
        ImageButton next7 = (ImageButton) findViewById(R.id.img31);
        ImageButton next8 = (ImageButton) findViewById(R.id.img34);
        ImageButton next9 = (ImageButton) findViewById(R.id.img36);
        ImageButton next10 = (ImageButton) findViewById(R.id.img38);
        ImageButton next11 = (ImageButton) findViewById(R.id.img16);
        ImageButton next12 = (ImageButton) findViewById(R.id.img11);
        ImageButton next13 = (ImageButton) findViewById(R.id.img2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity2.class);
                startActivity(i);
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity3.class);
                startActivity(i);
            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity4.class);
                startActivity(i);
            }
        });

        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity5.class);
                startActivity(i);
            }
        });

        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity6.class);
                startActivity(i);
            }
        });

        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity7.class);
                startActivity(i);
            }
        });

        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity8.class);
                startActivity(i);
            }
        });

        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity9.class);
                startActivity(i);
            }
        });

        next10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity10.class);
                startActivity(i);
            }
        });

        next11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity11.class);
                startActivity(i);
            }
        });

        next12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity12.class);
                startActivity(i);
            }
        });

        next13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity16.class);
                startActivity(i);
            }
        });
    }


}



