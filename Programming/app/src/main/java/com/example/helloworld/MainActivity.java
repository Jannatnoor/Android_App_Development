package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.helloworld.R;

public class MainActivity extends AppCompatActivity {

    private Boolean set = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StayHappy(View view) {
        set = ! set;
        TextView textView = findViewById(R.id.textView);
        textView.setText(set? "Tervetulua" : "StayHappy");
    }
}
