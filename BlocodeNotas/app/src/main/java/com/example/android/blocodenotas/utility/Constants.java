package com.example.android.blocodenotas.utility;

/**
 * Created by Adauto on 25/03/2016.
 */
public class Constants {
    public static final String NOTES_TABLE = "notes";

    public static final String COLUMN_ID = "_id";
    //public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_CONTENT = "content";
    //public static final String COLUMN_TAGS = "tags";
    public static final String COLUMN_MODIFIED_TIME = "modified_time";
    public static final String COLUMN_CREATED_TIME = "created_time";

    public static final String[] COLUMNS = {
            Constants.COLUMN_ID,
            Constants.COLUMN_TITLE,
            Constants.COLUMN_CONTENT,
            //Constants.COLUMN_TAGS,
            Constants.COLUMN_MODIFIED_TIME,
            Constants.COLUMN_CREATED_TIME
    };

}
