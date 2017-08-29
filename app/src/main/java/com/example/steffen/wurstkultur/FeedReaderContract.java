package com.example.steffen.wurstkultur;

import android.provider.BaseColumns;

/**
 * Created by steffen on 28.08.2017.
 */

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME_ITEMS = "Items";
        public static final String COLUMN_NAME_ITEM = "Item";
        public static final String COLUMN_NAME_PRICE = "Price";
        public static final String TABLE_NAME_LOCATION = "Location";
        public static final String COLUMN_NAME_CITY = "City";
        public static final String TABLE_NAME_ORDER = "Orders";
        public static final String COLUMN_NAME_DATE = "Date";
        public static final String COLUMN_NAME_TIME = "Time";
        public static final String COLUMN_NAME_ORDERTOTAL = "Price";
        public static final String TABLE_NAME_ORDERTOITEM = "OrderToItem";
        public static final String COLUMN_NAME_ORDERLOCATION = "OrderLoaction";
        public static final String COLUMN_NAME_ORDERID = "OrderID";
        public static final String COLUMN_NAME_ITEMID = "ItemID";
        public static final String COLUMN_NAME_QUANTITY = "Quantity";


    }
}