package com.example.megaclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void StartClick(View v){
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }
    public void AboutClick(View v){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}