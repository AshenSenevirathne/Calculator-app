package com.example.calculatormad_tut_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text1, text2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.num1);
        text2 = findViewById(R.id.num2);
        btn = findViewById(R.id.ok);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(text1.getText().toString());
                int number2 = Integer.parseInt(text2.getText().toString());

                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("num1", number1);
                intent.putExtra("num2", number2);

                startActivity(intent);
            }
        });
    }
}
