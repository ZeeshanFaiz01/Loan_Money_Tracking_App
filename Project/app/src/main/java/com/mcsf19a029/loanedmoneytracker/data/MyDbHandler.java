package com.mcsf19a029.loanedmoneytracker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;

import com.mcsf19a029.loanedmoneytracker.model.AccountRecord;
import com.mcsf19a029.loanedmoneytracker.model.LoanedMT;
import com.mcsf19a029.loanedmoneytracker.model.Record;
import com.mcsf19a029.loanedmoneytracker.params.Params;

import java.io.ByteArrayOutputStream;
import java.security.Key;

public class MyDbHandler extends SQLiteOpenHelper {
    Context context;
    private ByteArrayOutputStream byteArrayOutputStream;
    private byte[] imgToByte;
    public MyDbHandler(Context context){
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Params.TABLE_NAME + "("
                + Params.KEY_ID + " INTEGER PRIMARY KEY,"
                + Params.KEY_USER_NAME + " TEXT, "
                + Params.KEY_EMAIL + " TEXT, "
                + Params.KEY_PHONE + " TEXT, "
                + Params.KEY_PASSWORD + " TEXT" + ")";
        String AccRec = "CREATE TABLE " + Params.ACC_TABLE + "("
                + Params.KEY_ID + " INTEGER PRIMARY KEY,"
                + Params.KEY_NAME + " TEXT, "
                + Params.KEY_CONTACT + " TEXT)";
        String Rec = "CREATE TABLE " + Params.REC_TABLE + "("
                + Params.KEY_ID + " INTEGER PRIMARY KEY,"
                + Params.KEY_ACC_ID + " INTEGER,"
                + Params.KEY_DESCRIPTION + " TEXT,"
                + Params.KEY_IMG_NAME + " TEXT,"
                + Params.KEY_CURRENCY + " DECIMAL,"
                + Params.KEY_IMG + " BLOB)";
        try
        {
           db.execSQL(AccRec);
            Toast.makeText(context, "AccRec Table Created Successfully", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
           Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        try
        {
            db.execSQL(Rec);
            Toast.makeText(context, "Records Table Created Successfully", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
           Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        try
        {
            db.execSQL(create);
            Toast.makeText(context, "User Table Created Successfully", Toast.LENGTH_SHORT).show();
        }
       catch (Exception e)
       {
           Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
       }

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
        db.insert(Params.TABLE_NAME, null, values);
        db.close();
    }
    public void AccRecord(AccountRecord accRec){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Params.KEY_ID,accRec.getId());
        values.put(Params.KEY_NAME,accRec.getName());
        values.put(Params.KEY_CONTACT,accRec.getContact());
        db.insert(Params.ACC_TABLE,null,values);
        db.close();
    }
    public void AddRecord(Record record){
        SQLiteDatabase db = this.getWritableDatabase();
        Bitmap imgToStore = record.getImg();
        byteArrayOutputStream = new ByteArrayOutputStream();
        imgToStore.compress(Bitmap.CompressFormat.JPEG,100,byteArrayOutputStream);
        imgToByte = byteArrayOutputStream.toByteArray();
        ContentValues values = new ContentValues();
        values.put(Params.KEY_ID,record.getId());
        values.put(Params.KEY_ACC_ID,record.getAccID());
        values.put(Params.KEY_DESCRIPTION,record.getDescription());
        values.put(Params.KEY_CURRENCY,record.getCurrency());
        values.put(Params.KEY_IMG_NAME,record.getImgName());
        values.put(Params.KEY_IMG,imgToByte);
        db.insert(Params.REC_TABLE,null,values);
        db.close();

    }
}
