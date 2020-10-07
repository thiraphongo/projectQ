package com.example.projectq;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
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

public class SecondActivity14 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity14);
        final ImageButton ImageButton = (ImageButton) findViewById(R.id.img50);
        ImageButton next = (ImageButton) findViewById(R.id.img15);
        Button next2 = (Button) findViewById(R.id.btnnext);

        ImageButton ImageButtonIntent = (ImageButton)findViewById(R.id.img50);

        ImageButtonIntent.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/kanokpol.yooaiad/"));
                startActivity(Intent.createChooser(intent, "Open with"));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity14.this, SecondActivity13.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity14.this, SecondActivity15.class);
                startActivity(i);
            }
        });


    }
}

