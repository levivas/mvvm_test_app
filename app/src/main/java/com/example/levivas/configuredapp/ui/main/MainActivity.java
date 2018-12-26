package com.example.levivas.configuredapp.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.levivas.configuredapp.R;
import com.example.levivas.configuredapp.ui.second.SecondActivity;

public class MainActivity extends AppCompatActivity {
    Button myButtton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtton = findViewById(R.id.button);
        myButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = SecondActivity.newIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }
}
