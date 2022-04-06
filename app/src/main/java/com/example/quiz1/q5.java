package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class q5 extends AppCompatActivity {
int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        TextView TT = findViewById(R.id.T);
        Bundle bundle=getIntent().getExtras();
        score=bundle.getInt("score");
        TT.setText(String.valueOf(score));
        Button E = findViewById(R.id.E);
        Button M= findViewById(R.id.M);
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);

            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Q5 = new Intent(q5.this, MainActivity.class);
                startActivity(Q5);
            }
        });

    }
}