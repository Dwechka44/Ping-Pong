package com.example.megaclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Improve extends AppCompatActivity {

    public static int price1 = 200;
    public static int price2 = 500;
    public static int price3 = 1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve);
        TextView derev = findViewById(R.id.derev);
        TextView zhelez = findViewById(R.id.zhelez);
        TextView alma = findViewById(R.id.alma);
        ImageView derevo = findViewById(R.id.derevo);
        ImageView zhelezo = findViewById(R.id.zhelezo);
        ImageView almaz = findViewById(R.id.almaz);
        derev.setText("Цена меча -" + price1 + "монет. Улучшение дает + 10к урону");
        zhelez.setText("Цена меча -" + price2 + "монет. Улучшение дает + 25к урону");
        alma.setText("Цена меча -" + price3 + "монет. Улучшение дает + 50к урону");
        derevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutmoney >= price1) {
                    MainActivity.damage += 10;
                    MainActivity.coutmoney -= price1;
                    price1 += 20;
                    MainActivity.coutdre +=1;
                    MainActivity.textdre.setText(MainActivity.coutdre + "");
                    MainActivity.textrumpel.setText(MainActivity.coutmoney + "$");
                    derev.setText("Цена меча -" + price1 + "монет. Улучшение дает + 10к урону");
                }
            }
        });
        zhelezo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutmoney >= price1) {
                    MainActivity.damage += 25;
                    MainActivity.coutmoney -= price2;
                    price2 += 100;
                    MainActivity.coutzhe +=1;
                    MainActivity.textzhe.setText(MainActivity.coutzhe + "");
                    MainActivity.textrumpel.setText(MainActivity.coutmoney + "$");
                    zhelez.setText("Цена меча -" + price2 + "монет. Улучшение дает + 25к урону");
                }
            }
        });
        almaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.coutmoney >= price3) {
                    MainActivity.damage += 50;
                    MainActivity.coutmoney -= price3;
                    price3 += 200;
                    MainActivity.coutalm +=1;
                    MainActivity.textalm.setText(MainActivity.coutalm + "");
                    MainActivity.textrumpel.setText(MainActivity.coutmoney + "$");
                    alma.setText("Цена меча -" + price3 + "монет. Улучшение дает + 50к урону");
                }
            }
        });
    }
}

