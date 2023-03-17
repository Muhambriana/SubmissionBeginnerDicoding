package com.muhamapps.submissionproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGemastik;
    private ArrayList<Gemastik> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kategori Gemastik");
        rvGemastik = findViewById(R.id.rv_gemastik);
        rvGemastik.setHasFixedSize(true);
        list.addAll(GemastikData.getListData());

        showRecyclerlist();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_setting:
                showMyProfile();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showRecyclerlist() {
        rvGemastik.setLayoutManager(new LinearLayoutManager(this));
        GemastikAdapter gemastikAdapter = new GemastikAdapter(list);
        rvGemastik.setAdapter(gemastikAdapter);

        gemastikAdapter.setOnItemClick(new GemastikAdapter.OnItemClick() {
            @Override
            public void onItemClicked(Gemastik data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Gemastik gemastik){
        //Toast.makeText(this, "Kamu Memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailItem.class);
        intent.putExtra("nama_category", gemastik.getName());//mengoper data ke activity baru yaitu DetailItem.java
        intent.putExtra("foto_category", gemastik.getPhoto());
        intent.putExtra("detail_category", gemastik.getDetail());

        startActivity(intent);
    }

    private void showMyProfile(){
        Intent intent = new Intent(MainActivity.this, About.class);
        intent.putExtra("my_photo", R.drawable.profilephoto);
        intent.putExtra("my_name", "Briana Muham");
        intent.putExtra("my_email", "muhambriana.31@gmail.com");

        startActivity(intent);
    }


}