package com.muhamapps.submissionproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailItem extends AppCompatActivity {

    ImageView imageviewFotoCategory;
    TextView textviewNamaCategory, textviewDetailCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);
        imageviewFotoCategory = findViewById(R.id.imageViewFotoCategory);
        textviewNamaCategory = findViewById(R.id.textViewNamaCategory);
        textviewDetailCategory = findViewById(R.id.textViewDetailCategory);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        Integer fotoCategory = getIntent().getIntExtra("foto_category", 0);//untuk mendapatkan data yang sudah diberikan dari mainactivity
        String namaCategory = getIntent().getStringExtra("nama_category");
        String detailCategory = getIntent().getStringExtra("detail_category");
        
        setDataActivity(fotoCategory, namaCategory, detailCategory);
    }

    private void setDataActivity(Integer fotoCategory, String namaCategory, String detailCategory) {
        Glide.with(this).asBitmap().load(fotoCategory).into(imageviewFotoCategory);//untuk memasukan data yang sudah didapat kedalam ImageView
        textviewNamaCategory.setText(namaCategory);//untuk memasukan data yang sudah didapat kedalam TextView
        textviewDetailCategory.setText(detailCategory);
    }
}