package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mcsf19a029.loanedmoneytracker.data.MyDbHandler;
import com.mcsf19a029.loanedmoneytracker.model.LoanedMT;

public class signup extends AppCompatActivity {

    MyDbHandler db = new MyDbHandler(signup.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void login(View view) {
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void signUp(View view){
        EditText mail,user,pass,phone;
        mail = findViewById(R.id.mail);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        phone = findViewById(R.id.number);
        LoanedMT loanedMT = new LoanedMT(user.getText().toString(),mail.getText().toString(),phone.getText().toString(),pass.getText().toString());
        boolean flag = db.signUp(loanedMT);
        if(flag==true) {
            Toast.makeText(getApplicationContext(), "Sign-up Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Sign-up Un-Successfully", Toast.LENGTH_SHORT).show();
      }
    }
}