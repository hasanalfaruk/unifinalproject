package com.hasan.mathsukrevision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class OcrJun17Paper3 extends AppCompatActivity {

    private PDFView paper3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr_jun17_paper3);

        paper3 = (PDFView) findViewById(R.id.pdfOcr_Jun17_3);
        paper3.fromAsset("470240-3H-QPMS-jun17.pdf").load();
    }
}