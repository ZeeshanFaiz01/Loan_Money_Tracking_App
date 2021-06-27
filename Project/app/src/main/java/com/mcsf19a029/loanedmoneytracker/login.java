package com.mcsf19a029.loanedmoneytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mcsf19a029.loanedmoneytracker.data.MyDbHandler;

public class login extends AppCompatActivity {

    EditText user,pass;
    Button login1;
    MyDbHandler DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        login1 =findViewById(R.id.login1 );
        DB=new MyDbHandler(this);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userr = user.getText().toString();
                String passs = pass.getText().toString();

                if (userr.equals("") || passs.equals(""))
                    Toast.makeText(login.this, "Please enter all the fields", Toast.LENGTH_LONG).show();
                else{
                    Boolean checkUserPassword= DB.checkUsernamePassword(userr,passs);
                    if(checkUserPassword==true){
                        Toast.makeText(login.this, "You are Logged in", Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(), homepage.class);
                        startActivity(intent);
                    }
                  else {
                       Toast.makeText(login.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    public void signup(View view) {
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }

    
}