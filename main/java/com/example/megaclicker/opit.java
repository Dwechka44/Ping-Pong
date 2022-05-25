package com.example.megaclicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class opit extends AppCompatActivity {
    public static int pricefon1 = 10;
    public static int pricefon2 = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opit);
        ImageButton lavaButton = (ImageButton) findViewById(R.id.fonbut);
        ImageView sce = (ImageView) findViewById(R.id.sce);
        ImageView kamen = (ImageView) findViewById(R.id.cum);
        ImageView zombar = (ImageView) findViewById(R.id.zo);
        zombar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutxp >= pricefon2) {
                    MainActivity.zombe.setBackgroundResource(R.drawable.zomb);
                    MainActivity.sceleton.setImageAlpha(0);
                    MainActivity.coutxp -= pricefon2;
                    MainActivity.textXP.setText(MainActivity.coutxp + "XP");
                }
            }
        });
        sce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutxp >= pricefon2) {
                    MainActivity.sceleton.setBackgroundResource(R.drawable.unnamed);
                    MainActivity.zombe.setImageAlpha(0);
                    MainActivity.coutxp -= pricefon2;
                    MainActivity.textXP.setText(MainActivity.coutxp + "XP");
                }
            }
        });
        kamen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutxp >= pricefon1) {
                    MainActivity.Back.setBackgroundResource(R.drawable.kamenfon);

                    MainActivity.coutxp -= pricefon1;
                    MainActivity.textXP.setText(MainActivity.coutxp + "XP");

                }
            }
        });

        lavaButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.Q)
            @Override
            public void onClick(View v) {
                if (MainActivity.coutxp >= pricefon1) {
                    MainActivity.Back.setBackgroundResource(R.drawable.drevo);

                    MainActivity.coutxp -= pricefon1;
                    MainActivity.textXP.setText(MainActivity.coutxp + "XP");
                }


            }
        });
    }
}



