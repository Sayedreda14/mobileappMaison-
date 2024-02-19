package com.example.agriculturalautomationsystemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity6 extends AppCompatActivity {
    EditText userNametext,passWordtext,emailText;
    Button startButton,logupButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        passWordtext=findViewById(R.id.passWordtext);
        userNametext=findViewById(R.id.userNametext);
        emailText=findViewById(R.id.emailText);
        startButton=findViewById(R.id.startButton);
        logupButton=findViewById(R.id.logupButton);
    }

    public void log_up(View view) {
        List<String> owner=AgriDatabase.getInstance(this).getOwnerDAO().selectOwner();
        List<String> passcode=AgriDatabase.getInstance(this).getOwnerDAO().selectPasscode();
        List<String> email=AgriDatabase.getInstance(this).getOwnerDAO().selectEmail();
        String userName=userNametext.getText().toString();
        String password=passWordtext.getText().toString();
        String email_=emailText.getText().toString();
        if (!userName.equals("") && !password.equals("") && !email_.equals("")){
            logupButton.setEnabled(true);
            Toast.makeText(this,"Signed Up Successfully",Toast.LENGTH_LONG).show();
            owner.add(userName);
            passcode.add(password);
            email.add(email_);
            startButton.setEnabled(true);
        }
        else
            Toast.makeText(this,"Please fill in all the fields",Toast.LENGTH_LONG).show();

    }

    public void start(View view) {
        Intent in = new Intent(this, MainActivity3.class);
        startActivity(in);
    }
}