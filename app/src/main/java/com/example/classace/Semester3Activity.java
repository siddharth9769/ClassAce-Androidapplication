package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3);

        CardView syllabus3_4 = findViewById(R.id.Syllabus3_4);
        syllabus3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester3Activity.this,Syllabus3_4.class));
            }
        });
        CardView books = findViewById(R.id.books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester3Activity.this, CSBook3.class));
            }
        });
        CardView freelectures = findViewById(R.id.freelectures);
        freelectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester3Activity.this,CSVideo3.class));
            }
        });
        CardView previousyearpapers = findViewById(R.id.previousyearpapers);
        previousyearpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester3Activity.this,UpdatingSoon.class));

            }
        });
    }}