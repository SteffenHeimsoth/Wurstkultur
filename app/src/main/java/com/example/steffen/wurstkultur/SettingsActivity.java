package com.example.steffen.wurstkultur;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;


public class SettingsActivity extends AppCompatActivity {
    SQLiteDatabase dbRead;
    String[] columns;
    TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mTabHost = (TabHost) findViewById(R.id.ThManage);
        SqLiteManager mDbHelber = new SqLiteManager(this);
        dbRead = mDbHelber.getReadableDatabase();
        getTableColumns(FeedReaderContract.FeedEntry.TABLE_NAME_ITEMS);
        createAddEdit(FeedReaderContract.FeedEntry.TABLE_NAME_ITEMS);

    }
    public void getTableColumns(String tableName){
        String sql = "SELECT * FROM "+ tableName+" LIMIT 0";
        Cursor cursor =
        dbRead.rawQuery(sql, null);

        columns = cursor.getColumnNames();

//        String projection=""
//
//        Cursor cursor = dbRead.query(
//                FeedReaderContract.FeedEntry.TABLE_NAME_ITEMS,                     // The table to query
//                projection,                               // The columns to return
//                selection,                                // The columns for the WHERE clause
//                selectionArgs,                            // The values for the WHERE clause
//                null,                                     // don't group the rows
//                null,                                     // don't filter by row groups
//                sortOrder                                 // The sort order
//        );
    }
    public void createAddEdit(String tableName){
        mTabHost.setup();
        mTabHost.setup();
        TabHost.TabSpec tab1 = mTabHost.newTabSpec(tableName+" add");
        View view = getLayoutInflater().inflate(R.layout.tab_indicator, null
                , false);

        tab1.setIndicator(view);

        Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
        tab1.setContent(i);


        mTabHost.addTab(tab1);

        int a = 0;
    }

}
