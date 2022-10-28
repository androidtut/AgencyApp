package com.example.agencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.getstartedbtn);

        btn.setOnClickListener(v->{
            Toast.makeText(this, "getting started", Toast.LENGTH_SHORT).show();
        });
    }
}