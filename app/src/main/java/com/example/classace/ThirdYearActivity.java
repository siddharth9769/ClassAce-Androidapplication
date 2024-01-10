package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);

        CardView semester5 = findViewById(R.id.cardSemester5);
        semester5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdYearActivity.this,Semester5Activity.class));
            }
        });
        CardView semester6 = findViewById(R.id.cardSemester6);
        semester6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdYearActivity.this,Semester6Activity.class));

            }
        });
    }
}
