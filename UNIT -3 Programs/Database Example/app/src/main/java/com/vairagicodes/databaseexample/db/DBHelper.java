package com.vairagicodes.databaseexample.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "NotesDB";
    public static final int DB_VERSION = 1;

    public DBHelper( Context context) {
        super(context,DB_NAME,null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dbQuery = "CREATE TABLE NotesData (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"title TEXT,"
                + "description TEXT)";

        db.execSQL(dbQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNotes(String title, String description) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("title",title);
        values.put("description",description
        );

        db.insert("NotesData", null, values);

    }

}
