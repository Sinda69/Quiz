package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class q3 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rg1;
    Button B;
    int d;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        rg = findViewById(R.id.R);
        B = findViewById(R.id.b);
        Bundle bundle=getIntent().getExtras();
        score=bundle.getInt("score");
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d= rg.getCheckedRadioButtonId();
                rg1= findViewById(d);
                if(rg1.getText().toString().equals("-1"))
                {score++;
                    rg1.setBackgroundResource(R.drawable.red);
                    rg1.setTextColor(Color.WHITE);   }
                else {rg1.setBackgroundResource(R.drawable.green);
                    rg1.setTextColor(Color.WHITE);}
                Intent q4 = new Intent(q3.this, q4.class);
                q4.putExtra("score",score);
                startActivity(q4);

            }
        });
    }
}