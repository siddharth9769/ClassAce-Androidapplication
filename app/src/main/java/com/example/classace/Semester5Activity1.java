package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester5Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester51);

        CardView books = findViewById(R.id.books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester5Activity1.this,ITBook5.class));
            }
        });
        CardView previousyearpapers = findViewById(R.id.previousyearpapers);
        previousyearpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester5Activity1.this,UpdatingSoon.class));

            }
        });

    }}