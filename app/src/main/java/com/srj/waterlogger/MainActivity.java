package com.srj.waterlogger;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView, details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_selection);
        textView = findViewById(R.id.service_details);
        details = findViewById(R.id.details);
        textView.setOnClickListener(v -> {
            details.setVisibility(View.VISIBLE);
        });
    }
}