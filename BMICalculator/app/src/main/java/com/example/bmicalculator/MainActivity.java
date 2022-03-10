package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText height, weight;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.Height);
        weight = findViewById(R.id.Weight);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

    }
    public void calculatebmi(View view){
        String h = height.getText().toString();
        String w = weight.getText().toString();

        double height = Double.parseDouble(h);
        double weight = Double.parseDouble(w);
        double BMI = weight / (height / 100 * height / 100);

        result.setText("Your Result = " + String.format("%.2f", BMI));
    }

}