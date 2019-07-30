package com.example.calculatormad_tut_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int num1, num2;
    EditText text1, text2;
    Button add, sub, mul, div;
    TextView result;
    float value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num1 = getIntent().getIntExtra("num1", 0);
        num2 = getIntent().getIntExtra("num2", 0);


        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);


        text1.setText(String.valueOf(num1));
        text2.setText(String.valueOf(num2));

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = (float)num1 + num2;
               /* Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();*/
                result.setText(num1 + " + " + num2 + " = " + value);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = (float)num1 - num2;
                /* Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();*/
                result.setText(num1 + " - " + num2 + " = " + value);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = (float) num1 * num2;
                /* Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();*/
                result.setText(num1 + " * " + num2 + " = " + value);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = (float) num1 / num2;
                /* Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();*/
                result.setText(num1 + " / " + num2 + " = " + value);
            }
        });

    }
}
