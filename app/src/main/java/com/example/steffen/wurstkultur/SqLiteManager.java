package com.example.steffen.wurstkultur;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by steffen on 28.08.2017.
 */

public class SqLiteManager extends SQLiteOpenHelper {
    SQLiteOpenHelper sqLiteOpenHelper;

    private static final String[] SQL_CREATE_ENTRIES ={
            "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME_ITEMS + " (" +
                    FeedReaderContract.FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_ITEM + " TEXT," +
                    FeedReaderContract.FeedEntry.COLUMN_NAME_PRICE + " REAL)",
            "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME_LOCATION+" ("+
                    FeedReaderContract.FeedEntry._ID+" INTEGER PRIMARY KEY,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_CITY+" TEXT)" ,
            "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME_ORDER+ " ("+
                    FeedReaderContract.FeedEntry._ID+  " INTEGER PRIMARY KEY,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_DATE +" TEXT,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_TIME + " TEXT,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_ORDERTOTAL+ " REAL) ",
            "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME_ORDERTOITEM+" ("+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_ORDERID+" INTEGER,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_ITEMID+" INTEGER,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_ORDERLOCATION+" TEXT,"+
                    FeedReaderContract.FeedEntry.COLUMN_NAME_QUANTITY+" INTEGER)"}
            ;


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedReaderContract.FeedEntry.TABLE_NAME_ITEMS;

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Wurstkultur.db";

    public SqLiteManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {

        for (String s:SQL_CREATE_ENTRIES
             ) {
            db.execSQL(s);
        }
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//         This database is only a cache for online data, so its upgrade policy is
//         to simply to discard the data and start over
            db.execSQL(SQL_DELETE_ENTRIES);
            onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}


