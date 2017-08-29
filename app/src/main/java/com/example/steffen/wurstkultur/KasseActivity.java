package com.example.steffen.wurstkultur;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

public class KasseActivity extends AppCompatActivity {
    ListAdapter listAdapterBig,listAdapterSmall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasse);




        GridView gridViewBig = (GridView) findViewById(R.id.GvBig);



    }

    public void createListAdapter(){
         listAdapterBig = new ListAdapter() {
             @Override
             public boolean areAllItemsEnabled() {
                 return false;
             }

             @Override
             public boolean isEnabled(int i) {
                 return false;
             }

             @Override
             public void registerDataSetObserver(DataSetObserver dataSetObserver) {

             }

             @Override
             public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

             }

             @Override
             public int getCount() {
                 return 0;
             }

             @Override
             public Object getItem(int i) {
                 return null;
             }

             @Override
             public long getItemId(int i) {
                 return 0;
             }

             @Override
             public boolean hasStableIds() {
                 return false;
             }

             @Override
             public View getView(int i, View view, ViewGroup viewGroup) {
                 return null;
             }

             @Override
             public int getItemViewType(int i) {
                 return 0;
             }

             @Override
             public int getViewTypeCount() {
                 return 0;
             }

             @Override
             public boolean isEmpty() {
                 return false;
             }
         };
    }
}
