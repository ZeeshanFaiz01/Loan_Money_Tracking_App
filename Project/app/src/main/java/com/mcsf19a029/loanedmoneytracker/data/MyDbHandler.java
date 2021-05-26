package com.mcsf19a029.loanedmoneytracker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mcsf19a029.loanedmoneytracker.model.LoanedMT;
import com.mcsf19a029.loanedmoneytracker.params.Params;

import java.security.Key;

public class MyDbHandler extends SQLiteOpenHelper {

    public MyDbHandler(Context context){
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE" + Params.TABLE_NAME + "("
                + Params.KEY_ID + "INTEGER PRIMARY KEY,"
                + Params.KEY_USER_NAME + "TEXT,"
                + Params.KEY_EMAIL + "TEXT,"
                + Params.KEY_PHONE + "TEXT"
                + Params.KEY_PASSWORD + "TEXT" + ")";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void signUp(LoanedMT loanedMT)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Params.KEY_USER_NAME,loanedMT.getName());
        values.put(Params.KEY_EMAIL,loanedMT.getEmail());
        values.put(Params.KEY_PHONE,loanedMT.getPhone());
        values.put(Params.KEY_PASSWORD,loanedMT.getPass());
        db.insert(Params.TABLE_NAME,null,values);
        db.close();
    }
}
