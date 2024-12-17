package com.example.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button button1 = findViewById(R.id.button_to_overlap);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OverlapExample.class);
            startActivity(intent);
        });
        Button button2 = findViewById(R.id.button_radio);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RadioExample.class);
            startActivity(intent);
        });
        Button button3 = findViewById(R.id.button_weight);
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeightExample.class);
            startActivity(intent);
        });
        Button button4 = findViewById(R.id.button_url);
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UrlExample.class);
            startActivity(intent);
        });
        Button button5 = findViewById(R.id.button_form);
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormExample.class);
            startActivity(intent);
        });
    }
}
