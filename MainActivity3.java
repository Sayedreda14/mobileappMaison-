package com.example.agriculturalautomationsystemapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




    }

    public void show_data(View view) {
        Intent in = new Intent(this, MainActivity4.class);
        startActivity(in);
    }

    public void control_data(View view) {
        Intent in = new Intent(this, MainActivity5.class);
        startActivity(in);
    }
    public void adjustData(View view) {
        Intent in = new Intent(this, MainActivity8.class);
        startActivity(in);
    }

//    public void getNotify(View view) {
//
//        Log.d("MainActivity3", "getNotify called");
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity3.this,"notification");
//        builder.setContentText("check your internet connection");
//        builder.setAutoCancel(true);
//        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity3.this);
//        managerCompat.notify(1,builder.build());
//
//    }
}