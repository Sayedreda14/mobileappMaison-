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

public class MainActivity2 extends AppCompatActivity {
EditText nameText,passwordText;
Button loginButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameText=findViewById(R.id.nameText);
        passwordText=findViewById(R.id.passwordText);
        loginButton=findViewById(R.id.loginButton);


    }

    public void login(View view) {
        boolean check=false;
        String userName=nameText.getText().toString();
        String password=passwordText.getText().toString();
        List<String> owner=AgriDatabase.getInstance(this).getOwnerDAO().selectOwner();
        List<String> passcode=AgriDatabase.getInstance(this).getOwnerDAO().selectPasscode();
        for (int i = 0; i < owner.size(); i++) {
            if(userName.equals(owner.get(i)) && password.equals(passcode.get(i)))
                check=true;
        }
        if(check) {
            Intent  in = new Intent(this, MainActivity3.class);
            startActivity(in);
        }
        else
            Toast.makeText(this,"Try again",Toast.LENGTH_LONG).show();
        nameText.setText("");
        passwordText.setText("");

    }


}
