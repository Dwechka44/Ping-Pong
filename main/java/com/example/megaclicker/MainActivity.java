package com.example.megaclicker;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private MediaPlayer damagesound;
    public static int coutmoney = 0;
    static public int rumpel = 100;
    static public int XP = 10;
    public static int coutxp = 0;
    public static  ConstraintLayout Back;
    public static  ImageView sceleton;
    public static  ImageView zombe;
    public static int dre = 0;
    public static int zhe = 0;
    public static int alm = 0;
    public static int coutdre = 0;
    public static int coutzhe = 0;
    public static int coutalm = 0;
    ProgressBar progressBar;
    public static int damage = 10;
    static public  TextView textrumpel;
    static public  TextView textdre;
    static public  TextView textzhe;
    static public  TextView textalm;
    static public  TextView textXP;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        damagesound=MediaPlayer.create(this, R.raw.uron);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setProgress(progressBar.getProgress());
        textrumpel=(TextView)findViewById(R.id.rumpel);
        textdre =    (TextView)findViewById(R.id.dre);
        textzhe =   (TextView)findViewById(R.id.zhe);
        textalm=    (TextView)findViewById(R.id.alm);
        progressBar.setMax(100);
        progressBar.setProgress(progressBar.getMax());

        textXP = (TextView)findViewById(R.id.XP);
        Drawable zomber = ContextCompat.getDrawable(getApplicationContext(), R.drawable.zomb);
        Back = (ConstraintLayout)findViewById(R.id.fong);
        sceleton = (ImageView)findViewById(R.id.zomb);
        zombe = (ImageView)findViewById(R.id.zomb);
        ImageView zomb = findViewById(R.id.zomb);

        zomb.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                progressBar.setProgress(progressBar.getProgress() - damage);
                soundPlay (damagesound);
                if (progressBar.getProgress() == 0){
                coutxp += XP;
                coutmoney += rumpel;
                coutdre += dre;
                coutzhe += zhe;
                coutalm += alm;
                textXP.setText(coutxp + "XP");
                textrumpel.setText(coutmoney + "$");
                progressBar.setMax(progressBar.getMax() + 20);
                progressBar.setProgress(progressBar.getMax());

                }
            }

        });
        zomb.setOnTouchListener(new View.OnTouchListener() {


            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    view.animate().scaleX(0.98f).scaleY(0.98f).setDuration(0);


                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    view.animate().scaleX(1f).scaleY(1f).setDuration(0);

                }
                return false;
            }


        });


        //new Saver().load_save();//
    }
    public void soundPlay (MediaPlayer sound ){
        sound.start();
    }


    public void Magazineclick(View v){
        Intent intent = new Intent(this, Improve.class);
        startActivity(intent);
    }
    public void Opitclick(View v){
        Intent intent = new Intent(this, opit.class);
        startActivity(intent);
    }
}


