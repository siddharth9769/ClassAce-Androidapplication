package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CSsyllabus3_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cssyllabus34);
        PDFView pdfView =findViewById(R.id.pdf_view);

        pdfView.fromAsset("sycs.pdf").load();
    }
}

