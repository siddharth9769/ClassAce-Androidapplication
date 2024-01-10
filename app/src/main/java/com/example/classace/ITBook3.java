package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ITBook3 extends AppCompatActivity {
    private ImageView Btn_Python, Btn_Linearalgebra, Btn_Datastructure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbook3);

        View Btn_Pos = findViewById(R.id.Pos);
        View Btn_Python = findViewById(R.id.Python);
        View Btn_Datastructure = findViewById(R.id.Datastructure);

        Btn_Pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook3.this
                        , Pos.class));
            }
        });


        Btn_Python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook3.this
                        , Python.class));
            }
        });


        Btn_Datastructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook3.this
                        , Datastructure.class));
            }
        });
    }
}
