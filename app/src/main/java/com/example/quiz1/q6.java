package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class q6 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rg1;
    Button B;
    int d;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        rg = findViewById(R.id.R);
        B = findViewById(R.id.b);
        Bundle bundle=getIntent().getExtras();
        score=bundle.getInt("score");
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d= rg.getCheckedRadioButtonId();
                rg1= findViewById(d);
                if(rg1.getText().toString().equals("arcsin(x)"))
                {score++;
                    rg1.setBackgroundResource(R.drawable.red);
                    rg1.setTextColor(Color.WHITE);   }
                else {rg1.setBackgroundResource(R.drawable.green);
                    rg1.setTextColor(Color.WHITE);}
                if(score==0)
                {Intent q7 = new Intent(q6.this, q7.class);
                q7.putExtra("score",score);
                startActivity(q7);}
                else if(score==1|score==2|score==3)
                {Intent q8 = new Intent(q6.this, q8.class);
                    q8.putExtra("score",score);
                    startActivity(q8);}
                else {Intent q5 = new Intent(q6.this, q5.class);
                    q5.putExtra("score",score);
                    startActivity(q5);}

            }
        });
    }
}