package com.pbm.hedelsia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView bektumen;

        bektumen = findViewById(R.id.bektumen);

        bektumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        CardView menubuah;

        menubuah = findViewById(R.id.menubuah);

        menubuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HalBuahActivity.class);
                startActivity(intent);
            }
        });

        CardView menusayur;

        menusayur = findViewById(R.id.menusayur);

        menusayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HalSayurActivity.class);
                startActivity(intent);
            }
        });
    }
}