package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook3 extends AppCompatActivity {

    private ImageView Btn_Pos, Btn_Linearalgebra, Btn_Datastructure, Btn_Jad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook3);


        View Btn_Pos = findViewById(R.id.Pos);
        View Btn_Linearalgebra = findViewById(R.id.Linearalgebra);
        View Btn_Datastructure = findViewById(R.id.Datastructure);
        View Btn_Jad = findViewById(R.id.Jad);

        Btn_Pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook3.this
                        ,Pos.class));
            }
        });


        Btn_Linearalgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook3.this
                        ,Linearalgebra.class));
            }
        });


        Btn_Datastructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook3.this
                        ,Datastructure.class));
            }
        });


        Btn_Jad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook3.this
                        ,Jad.class));
            }
        });




    }
}
