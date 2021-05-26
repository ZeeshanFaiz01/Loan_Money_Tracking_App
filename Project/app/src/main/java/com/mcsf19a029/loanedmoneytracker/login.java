package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signup(View view) {
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }

    public void homePage(View view) {
        EditText user = findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.password);
        Intent intent = new Intent(this, homepage.class);
        if(user.getText().toString().equals("Zeeshan") & pass.getText().toString().equals("123"))
            startActivity(intent);
        else
            Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();
    }
    public void login(View view)
    {


    }
}