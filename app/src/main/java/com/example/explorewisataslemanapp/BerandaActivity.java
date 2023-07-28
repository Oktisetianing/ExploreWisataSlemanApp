package com.example.explorewisataslemanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class BerandaActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    CircleImageView gmbrprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        gmbrprofile = (CircleImageView) findViewById(R.id.gmbrprofile);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, PaketWisataActivity.class);
                finish();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, WisataCandiActivity.class);
                finish();
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, WisataAlamActivity.class);
                finish();
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, WisataLainnyaActivity.class);
                finish();
                startActivity(intent);
            }
        });
        gmbrprofile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this,ProfileActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }
}