package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ITSyllabus1_2 extends AppCompatActivity {
    private ImageView Btn_syllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itsyllabus12);

        Btn_syllabus = findViewById(R.id.syllabus);

        Btn_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITSyllabus1_2.this
                        ,syllabusit12.class));
            }
        });




    }
}



