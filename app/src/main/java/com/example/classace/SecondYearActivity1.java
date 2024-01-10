package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondYearActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year1);

        CardView semester3_1 = findViewById(R.id.cardSemester3_1);
        semester3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondYearActivity1.this,Semester3Activity1.class));
            }
        });
        CardView semester4_1 = findViewById(R.id.cardSemester4_1);
        semester4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondYearActivity1.this,Semester4Activity1.class));

            }
        });
    }
}


