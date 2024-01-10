package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook2 extends AppCompatActivity {

    private ImageView Btn_Daa, Btn_Advancepython, Btn_Cplusplus, Btn_Dbms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook2);



        View Btn_Daa = findViewById(R.id.Daa);
        View Btn_Advancepython = findViewById(R.id.Advancepython);
        View Btn_Cplusplus = findViewById(R.id.Cplusplus);
        View Btn_Dbms = findViewById(R.id.Dbms);

        Btn_Daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook2.this
                        ,Daa.class));
            }
        });


        Btn_Advancepython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook2.this
                        ,Advancepython.class));
            }
        });


        Btn_Cplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook2.this
                        ,Cplusplus.class));
            }
        });


        Btn_Dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook2.this
                        ,Dbms.class));
            }
        });




    }
}
