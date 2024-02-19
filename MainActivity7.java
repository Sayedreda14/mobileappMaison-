package com.example.agriculturalautomationsystemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    TextView docText;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        docText=findViewById(R.id.docText);

        StringBuilder documentation = new StringBuilder();
        documentation.append("Welcome to the Agricultural Automation App!\n\n");
        documentation.append("Overview:\n");
        documentation.append("• This app is designed to help you remotely monitor and control agricultural systems.\n");
        documentation.append("• Before you begin, make sure your device meets the system requirements.\n\n");
        documentation.append("Data Synchronization:\n");
        documentation.append("• Data synchronization occurs in real-time and historical data is synced from the central database for monitoring purposes.\n");
        documentation.append("• If you encounter sync issues, check your internet connection and try again.\n\n");
        documentation.append("Control Features:\n");
        documentation.append("• Take control of irrigation, fertilization, and pest control with the app's automated systems.\n\n");
        documentation.append("Alerts and Notifications:\n");
        documentation.append("• Stay informed with real-time alerts and notifications.\n");
        documentation.append("• If you miss notifications, check your device settings.\n");

        docText.setText(documentation.toString());


    }
}