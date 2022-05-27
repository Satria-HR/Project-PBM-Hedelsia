package com.pbm.hedelsia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BuahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        TextView sal = (TextView) findViewById(R.id.scrollal);
        sal.setMovementMethod(new ScrollingMovementMethod());

        TextView smal = (TextView) findViewById(R.id.scrollmanal);
        smal.setMovementMethod(new ScrollingMovementMethod());

        ImageView bektumenubuah;

        bektumenubuah = findViewById(R.id.bektumenubuah);

        bektumenubuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuahActivity.this, HalBuahActivity.class);
                startActivity(intent);
            }
        });
    }
}