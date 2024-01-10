package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstYearActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year1);

        CardView semester1_1 = findViewById(R.id.cardSemester1_1);
        semester1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstYearActivity1.this,Semester1Activity1.class));
            }
        });
        CardView semester2_1 = findViewById(R.id.cardSemester2_1);
        semester2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstYearActivity1.this,Semester2Activity1.class));

            }
        });
    }
}

