package com.mcsf19a029.loanedmoneytracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mcsf19a029.loanedmoneytracker.params.Params;

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
                + Params.KEY_PHONE + "TEXT" + ")";

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
