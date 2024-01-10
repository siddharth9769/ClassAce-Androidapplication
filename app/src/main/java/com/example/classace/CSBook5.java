package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook5 extends AppCompatActivity {

    private ImageView Btn_Artificialintelligence, Btn_Ins, Btn_Stqa, Btn_Projectm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook5);

        View Btn_Artificialintelligence = findViewById(R.id.Artificialintelligence);
        View Btn_Ins = findViewById(R.id.Ins);
        View Btn_Stqa = findViewById(R.id.Stqa);
        View Btn_Projectm = findViewById(R.id.Projectm);

        Btn_Artificialintelligence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook5.this
                        ,Artificial.class));
            }
        });


        Btn_Ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook5.this
                        ,Ins.class));
            }
        });


        Btn_Stqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook5.this
                        ,Stqa.class));
            }
        });


        Btn_Projectm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook5.this
                        ,Project.class));
            }
        });




    }
}

