package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class FindCourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_course);

        CardView BSC_CS = findViewById(R.id.cardBSC_CS);
        BSC_CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindCourseActivity.this,SelectAcademicYearActivity.class));
            }
        });
        CardView BSC_IT = findViewById(R.id.cardBSC_IT);
        BSC_IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindCourseActivity.this,SelectAcademicYearActivity1.class));

            }
        });
    }
}
