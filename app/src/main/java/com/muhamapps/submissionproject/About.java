package com.muhamapps.submissionproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class About extends AppCompatActivity {
    ImageView imageviewFoto;
    TextView textviewNama, textviewEmail;
    FloatingActionButton Emailfab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About");
        imageviewFoto = findViewById(R.id.imageViewFotoProfil);
        textviewNama = findViewById(R.id.textvViewNamaProfil);
        textviewEmail = findViewById(R.id.textViewEmailProfil);
        Emailfab = findViewById(R.id.emailfab);

        getIncomingExtra();
        setSendEmail();
    }

    private void getIncomingExtra() {
        Integer foto = getIntent().getIntExtra("my_photo", 0);
        String name = getIntent().getStringExtra("my_name");
        String email = getIntent().getStringExtra("my_email");

        setDataActivity(foto, name, email);
    }

    private void setDataActivity(Integer foto, String name, String email) {
        Glide.with(this).asBitmap().load(foto).into(imageviewFoto);
        textviewNama.setText(name);
        textviewEmail.setText(email);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setSendEmail(){
        Emailfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","muhambriana.31@email.com", null));
                startActivity(intent);
            }
        });
    }


}
