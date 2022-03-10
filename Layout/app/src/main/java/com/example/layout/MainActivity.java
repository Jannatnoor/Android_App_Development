package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void bestwishes(View view) {
            Button button = (Button) view;
            button.setBackgroundColor(Color.YELLOW);
            button.setTextColor(Color.BLACK);
            button.setText("BestWishes");
        }
    }
