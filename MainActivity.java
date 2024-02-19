package com.example.agriculturalautomationsystemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign_in(View view) {
        Intent  in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }

    public void sign_up(View view) {
        Intent  in = new Intent(this, MainActivity6.class);
        startActivity(in);
    }

    public void documentation(View view) {
        Intent  in = new Intent(this, MainActivity7.class);
        startActivity(in);

    }
}