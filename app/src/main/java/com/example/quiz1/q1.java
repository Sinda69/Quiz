package com.example.quiz1;

import static android.R.color.white;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class q1 extends AppCompatActivity {
RadioGroup rg;
RadioButton rg1;
Button B;
int d;
int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        rg = findViewById(R.id.R);
        B = findViewById(R.id.b);
        B.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                d= rg.getCheckedRadioButtonId();
                rg1= findViewById(d);
                if(rg1.getText().toString().equals("3.141592"))
                   {score++;
                       rg1.setBackgroundResource(R.drawable.red);
                       rg1.setTextColor(Color.WHITE);}
                else {rg1.setBackgroundResource(R.drawable.green);
                    rg1.setTextColor(Color.WHITE);}

                Intent q2 = new Intent(q1.this, q2.class);
                q2.putExtra("score",score);
                startActivity(q2);

            }
        });

    }
}