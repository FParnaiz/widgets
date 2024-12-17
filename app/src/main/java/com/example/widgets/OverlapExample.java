package com.example.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OverlapExample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // If EdgeToEdge is part of your custom utilities, ensure it's included in your project.
        // Remove this line if EdgeToEdge is unavailable.
        // EdgeToEdge.enable(this);

        setContentView(R.layout.overlap_example);

        // Apply window insets for edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button1 = findViewById(R.id.button_small);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(OverlapExample.this, MainActivity.class);
            startActivity(intent);
        });
        Button button2 = findViewById(R.id.button_big);
        button2.setOnClickListener(v -> {
            Toast.makeText(this, "I'm the big one", Toast.LENGTH_SHORT).show();

        });
    }
}
