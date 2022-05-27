package com.pbm.hedelsia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HalBuahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_buah);

        ImageView bektumenu;

        bektumenu = findViewById(R.id.bektumenu);

        bektumenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalBuahActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        TextView alpukattomb;

        alpukattomb = findViewById(R.id.alpukattomb);

        alpukattomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalBuahActivity.this, BuahActivity.class);
                startActivity(intent);
            }
        });
    }
}