package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Semester1Activity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester11);

        CardView ITSyllabus1_2 = findViewById(R.id.ITSyllabus1_2);
        ITSyllabus1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity1.this,ITSyllabus1_2.class));
            }
        });
        CardView books = findViewById(R.id.books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity1.this,ITBook1.class));
            }
        });
        CardView previousyearpapers = findViewById(R.id.previousyearpapers);
        previousyearpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Semester1Activity1.this,UpdatingSoon.class));

            }
        });

    }}