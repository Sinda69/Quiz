package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView W;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView W = findViewById(R.id.we);
        Button S = findViewById(R.id.st);
        Button E = findViewById(R.id.ex);
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q1 = new Intent(MainActivity.this,q1.class);
                startActivity(Q1);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
    }
}