package com.pbm.hedelsia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SayurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayur);

        TextView sc = (TextView) findViewById(R.id.scrollas);
        sc.setMovementMethod(new ScrollingMovementMethod());

        TextView sma = (TextView) findViewById(R.id.scrollmanas);
        sma.setMovementMethod(new ScrollingMovementMethod());

        ImageView bektumenusayur;

        bektumenusayur = findViewById(R.id.bektumenusayur);

        bektumenusayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SayurActivity.this, HalSayurActivity.class);
                startActivity(intent);
            }
        });
    }
}