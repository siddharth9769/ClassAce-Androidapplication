package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CSBook4 extends AppCompatActivity {

    private ImageView Btn_Toc, Btn_Computernet, Btn_Softwareengine, Btn_Android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csbook4);

        View Btn_Toc = findViewById(R.id.Toc);
        View Btn_Computernet = findViewById(R.id.Computernet);
        View Btn_Softwareengine = findViewById(R.id.Softwareengine);
        View Btn_Android = findViewById(R.id.Android);

        Btn_Toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook4.this
                        ,Toc.class));
            }
        });


        Btn_Computernet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook4.this
                        ,Computernet.class));
            }
        });


        Btn_Softwareengine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook4.this
                        ,Softwareengine.class));
            }
        });


        Btn_Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CSBook4.this
                        ,Android.class));
            }
        });




    }
}
