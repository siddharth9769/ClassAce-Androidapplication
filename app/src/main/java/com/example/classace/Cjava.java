package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Cjava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cjava);

        PDFView pdfView = findViewById(R.id.pdf_view);

        pdfView.fromAsset("cjava.pdf").load();
    }}
