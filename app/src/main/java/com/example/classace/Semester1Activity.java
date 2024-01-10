package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Semester1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);

        CardView syllabus1_2 = findViewById(R.id.Syllabus1_2);
        syllabus1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity.this,Syllabus1_2.class));
            }
        });
        CardView books = findViewById(R.id.books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity.this,CSBook1.class));
            }
        });
        CardView freelectures = findViewById(R.id.freelectures);
        freelectures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity.this,CSVideo1.class));
            }
        });
        CardView previousyearpapers = findViewById(R.id.previousyearpapers);
        previousyearpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity.this,UpdatingSoon.class));

            }
        });
    }}