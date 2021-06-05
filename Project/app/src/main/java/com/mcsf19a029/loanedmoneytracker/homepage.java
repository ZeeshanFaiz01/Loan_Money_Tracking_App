package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        RecyclerView recycler = findViewById(R.id.recycler);
    }

    public void addRecord(View view) {
        Intent intent = new Intent(this, AddRecord.class);
        startActivity(intent);
    }
}