package com.jiadibo.myplants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bitmap imageBitmap = (Bitmap) getIntent().getBundleExtra("imagedata").get("data");

        int pred = getIntent().getIntExtra("pred",0);

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageBitmap(imageBitmap);

        TextView txt_name = findViewById(R.id.label);
        TextView txt_latin = findViewById(R.id.latin);
        TextView txt_klasfikasi = findViewById(R.id.klasifikasi);
        TextView txt_info = findViewById(R.id.info);
        txt_name.setText(Constants.PLANT_CLASSES[pred][0]);
        txt_latin.setText(Constants.PLANT_CLASSES[pred][1]);
        txt_klasfikasi.setText(Constants.PLANT_CLASSES[pred][2]);
        txt_info.setText(Constants.PLANT_CLASSES[pred][3]);

    }
}