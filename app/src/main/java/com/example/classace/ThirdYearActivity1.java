package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdYearActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year1);

        CardView semester5_1 = findViewById(R.id.cardSemester5_1);
        semester5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdYearActivity1.this,Semester5Activity1.class));
            }
        });
        CardView semester6_1 = findViewById(R.id.cardSemester6_1);
        semester6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdYearActivity1.this,Semester6Activity1.class));

            }
        });
    }
}
