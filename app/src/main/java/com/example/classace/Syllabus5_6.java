package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Syllabus5_6 extends AppCompatActivity {
    private ImageView Btn_syllabus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus56);

        Btn_syllabus = findViewById(R.id.syllabus);

        Btn_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Syllabus5_6.this
                        ,CSsyllabus5_6.class));
            }
        });




    }
}

