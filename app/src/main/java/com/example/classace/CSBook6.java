package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook6 extends AppCompatActivity {
    private ImageView Btn_Datascience, Btn_Cloudcomp, Btn_Wsn, Btn_Ethicalhacking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook6);

        View Btn_Datascience = findViewById(R.id.Datascience);
        View Btn_Cloudcomp = findViewById(R.id.Cloudcomp);
        View Btn_Wsn = findViewById(R.id.Wsn);
        View Btn_Ethicalhacking = findViewById(R.id.Ethicalhacking);

        Btn_Datascience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook6.this
                        ,Datascience.class));
            }
        });


        Btn_Cloudcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook6.this
                        ,Cloudcomp.class));
            }
        });


        Btn_Wsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook6.this
                        ,Wsn.class));
            }
        });


        Btn_Ethicalhacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook6.this
                        ,Ethicalhacking.class));
            }
        });




    }
}
