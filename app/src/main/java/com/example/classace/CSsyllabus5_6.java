package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CSsyllabus5_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cssyllabus56);

        PDFView pdfView =findViewById(R.id.pdf_view);

        pdfView.fromAsset("tycs.pdf").load();
    }
}
