package com.example.practice;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context){
        super(context, "userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table userdetails(name TEXT primary key, age TEXT, date TEXT, radio TEXT, checkbox TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists userdetails");
    }

    public boolean insertData(String name, String age, String date, String radio, String checkbox) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("age", age);
        contentValues.put("date", date);
        contentValues.put("radio", radio);
        contentValues.put("checkbox", checkbox);
        long res = db.insert("userdetails", null, contentValues);
        if(res == -1)
            return false;
        return true;
    }
}
