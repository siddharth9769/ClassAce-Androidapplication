package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ITBook1 extends AppCompatActivity {
    private ImageView Btn_Dsa, Btn_Tcs, Btn_Ppc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itbook1);

        View Btn_Dsa = findViewById(R.id.Dsa);
        View Btn_Tcs = findViewById(R.id.Tcs);
        View Btn_Ppc = findViewById(R.id.Ppc);


        Btn_Dsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook1.this
                        ,Dsa.class));
            }
        });


        Btn_Tcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook1.this
                        ,Tcs.class));
            }
        });


        Btn_Ppc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ITBook1.this
                        ,Ppc.class));
            }
        });







    }
}

