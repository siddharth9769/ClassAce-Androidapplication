package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectAcademicYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_academic_year);

        CardView firstyear = findViewById(R.id.cardFirstYear);
        firstyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity.this,FirstYearActivity.class));
            }
        });
        CardView secondyear = findViewById(R.id.cardSecondYear);
        secondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity.this,SecondYearActivity.class));

            }
        });
        CardView thirdyear = findViewById(R.id.cardThirdYear);
        thirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity.this,ThirdYearActivity.class));

            }
        });
    }
}

