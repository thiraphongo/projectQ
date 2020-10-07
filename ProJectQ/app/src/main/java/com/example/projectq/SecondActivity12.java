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

public class SecondActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity12);
        final ImageButton ImageButton = (ImageButton) findViewById(R.id.img40);
        ImageButton next = (ImageButton) findViewById(R.id.img15);
        Button next2 = (Button) findViewById(R.id.btnnext);

        ImageButton ImageButtonIntent = (ImageButton)findViewById(R.id.img40);

        ImageButtonIntent.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/teerapong.onkham.58/"));
                startActivity(Intent.createChooser(intent, "Open with"));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity12.this, SecondActivity13.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity12.this, SecondActivity14.class);
                startActivity(i);
            }
        });

    }
}