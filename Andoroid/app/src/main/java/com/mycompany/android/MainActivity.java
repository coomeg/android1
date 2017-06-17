package com.mycompany.android;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.database.sqlite.*;

public class MainActivity extends Activity 
{
	private final static String DB_NAME = "test.db"; 	
	private final static String DB_TABLE = "test"; 	
	private final static String DB_COLUMUS = "(item1 text, item2 text, item3 text, primary key(item1))"; 	
	private final static int DB_VERSION = 1; 	
	private SQLiteDatabase mySQLiteDatabase = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);		
        setContentView(R.layout.main);
    }
}
