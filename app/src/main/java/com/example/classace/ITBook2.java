package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ITBook2 extends AppCompatActivity {
    private ImageView Btn_Wad, Btn_Git, Btn_Cplusplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbook2);


        View Btn_Wad = findViewById(R.id.Wad);
        View Btn_Git = findViewById(R.id.Git);
        View Btn_Cplusplus = findViewById(R.id.Cplusplus);


        Btn_Wad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook2.this
                        ,Wad.class));
            }
        });


        Btn_Git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook2.this
                        ,Git.class));
            }
        });


        Btn_Cplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook2.this
                        ,Cplusplus.class));
            }
        });







    }
}