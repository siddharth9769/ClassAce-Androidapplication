package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectAcademicYearActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_academic_year1);

        CardView firstyear1 = findViewById(R.id.cardFirstYear1);
        firstyear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity1.this,FirstYearActivity1.class));
            }
        });
        CardView secondyear1 = findViewById(R.id.cardSecondYear1);
        secondyear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity1.this,SecondYearActivity1.class));

            }
        });
        CardView thirdyear1 = findViewById(R.id.cardThirdYear1);
        thirdyear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectAcademicYearActivity1.this,ThirdYearActivity1.class));

            }
        });
    }
}



