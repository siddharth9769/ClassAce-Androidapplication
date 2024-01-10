package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook1 extends AppCompatActivity {
    private ImageView Btn_Dsa, Btn_Python, Btn_Linux, Btn_Dism;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook1);

        View Btn_Dsa = findViewById(R.id.Dsa);
        View Btn_Python = findViewById(R.id.Python);
        View Btn_Linux = findViewById(R.id.Linux);
        View Btn_Dism = findViewById(R.id.Dism);

        Btn_Dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook1.this
                        ,Dsa.class));
            }
        });


        Btn_Python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook1.this
                        ,Python.class));
            }
        });


        Btn_Linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook1.this
                        ,Linux.class));
            }
        });


        Btn_Dism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook1.this
                        ,Dism.class));
            }
        });




    }
}

