package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ITBook4 extends AppCompatActivity {
    private ImageView Btn_Cjava, Btn_Embs, Btn_Softwareengine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbook4);

        View Btn_Cjava = findViewById(R.id.Cjava);
        View Btn_Embs = findViewById(R.id.Embs);
        View Btn_Softwareengine = findViewById(R.id.Softwareengine);


        Btn_Cjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook4.this
                        ,Cjava.class));
            }
        });


        Btn_Embs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook4.this
                        ,Embs.class));
            }
        });


        Btn_Softwareengine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook4.this
                        ,Softwareengine.class));
            }
        });
    }
}