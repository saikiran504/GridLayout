package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView users;
    CardView Adduser;
    CardView news;
    CardView setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users=findViewById(R.id.Users);
        Adduser=findViewById(R.id.Adduser);
        news=findViewById(R.id.news);
        setting=findViewById(R.id.setting);




        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "photo cake", Toast.LENGTH_SHORT).show();
                Intent photo =  new Intent(MainActivity.this,photo.class);
                startActivity(photo);


            }
        });

        Adduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "step cake", Toast.LENGTH_SHORT).show();
              Intent step=  new Intent(MainActivity.this,step.class);
              startActivity(step);

            }
        });


        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "fruit cake", Toast.LENGTH_SHORT).show();
                Intent fruit=  new Intent(MainActivity.this,fruit.class);
                startActivity(fruit);

            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "shape cake", Toast.LENGTH_SHORT).show();
                Intent shape =  new Intent(MainActivity.this, shape.class);
                startActivity(shape);


            }
        });

    }
}