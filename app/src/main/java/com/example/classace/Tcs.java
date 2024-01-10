package com.example.classace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tcs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcs);

        PDFView pdfView = findViewById(R.id.pdf_view);

        pdfView.fromAsset("tcs.pdf").load();
    }}