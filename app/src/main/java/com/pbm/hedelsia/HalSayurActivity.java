package com.pbm.hedelsia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HalSayurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_sayur);

        ImageView bektumenu;

        bektumenu = findViewById(R.id.bektumenu);

        bektumenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalSayurActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        TextView aspartomb;

        aspartomb = findViewById(R.id.aspartomb);

        aspartomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalSayurActivity.this, SayurActivity.class);
                startActivity(intent);
            }
        });
    }
}