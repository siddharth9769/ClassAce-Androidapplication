package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfView=findViewById(R.id.pdfView);

        int syllabus_position=getIntent().getIntExtra("key_position",0);

        if(syllabus_position==0){
            pdfView.fromAsset("fy sc syllabus.pdf").load();
        }
    }
}