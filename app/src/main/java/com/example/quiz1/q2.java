package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.R.color;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class q2 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rg1;
    Button B;
    int d;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        rg = findViewById(R.id.R);
        B = findViewById(R.id.b);
        Bundle bundle=getIntent().getExtras();
        score=bundle.getInt("score");
        B.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                d= rg.getCheckedRadioButtonId();
                rg1= findViewById(d);
                if(rg1.getText().toString().equals("25.6"))
                {score++;
                    rg1.setBackgroundResource(R.drawable.red);
                    rg1.setTextColor(Color.WHITE);   }
                else {rg1.setBackgroundResource(R.drawable.green);
                    rg1.setTextColor(Color.WHITE);}
                Intent q3 = new Intent(q2.this, q3.class);
                q3.putExtra("score",score);
                startActivity(q3);

            }
        });
    }
}
