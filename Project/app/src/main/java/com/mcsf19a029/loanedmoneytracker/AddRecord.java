package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mcsf19a029.loanedmoneytracker.data.MyDbHandler;
import com.mcsf19a029.loanedmoneytracker.model.AccountRecord;

public class AddRecord extends AppCompatActivity {
    EditText name,contact;
    MyDbHandler handler = new MyDbHandler(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);
        name = (EditText) findViewById(R.id.name);
        contact = (EditText) findViewById(R.id.contact);
    }

    public void take(View view) {
        try
        {
            AccountRecord accountRecord=new AccountRecord(name.getText().toString(),contact.getText().toString());
            handler.AccRecord(accountRecord);
            Toast.makeText(this, "Name: " + name.getText().toString() + " Contact: " + contact.getText().toString() + "Adding Succesfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Taken.class);
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void give(View view) {
        try
        {
            Toast.makeText(this, "Name: " + name.getText().toString() + " Contact: " + contact.getText().toString(), Toast.LENGTH_SHORT).show();
            AccountRecord accountRecord=new AccountRecord(name.getText().toString(),contact.getText().toString());
            handler.AccRecord(accountRecord);
            Intent intent = new Intent(this,Given.class);
            startActivity(intent);
        }
        catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}