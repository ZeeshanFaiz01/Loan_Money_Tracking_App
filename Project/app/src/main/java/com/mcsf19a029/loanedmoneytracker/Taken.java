package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Taken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taken);
    }

    public void ClickPhoto(View view) {
        Intent intent = new Intent(this,picture.class);
        startActivity(intent);
    }
}