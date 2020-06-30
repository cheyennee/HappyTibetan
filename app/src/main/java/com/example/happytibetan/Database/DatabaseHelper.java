package com.example.happytibetan.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table word(num int,text1 varchar(100),text2 varchar(100))";
        db.execSQL(sql);
        ContentValues values = new ContentValues();
        values.put("num",0);
        values.put("text1","xxx");
        values.put("text2","ggg");
        db.insert("word",null,values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
