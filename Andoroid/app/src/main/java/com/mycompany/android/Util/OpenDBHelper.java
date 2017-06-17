package com.mycompany.android.Util;
import android.database.sqlite.*;
import android.content.*;
import android.text.*;
import android.util.*;
import org.xml.sax.*;
import java.io.*;

public class OpenDBHelper extends SQLiteOpenHelper
{
	
	public Context context
	;
	public static final String TAG= "DBOpenHelper";
	public static final String DB_NAME = "testDB";
	public static final Integer DB_VERSION = 1;
	

	public OpenDBHelper(Context context)
	{
		super(context,DB_NAME,null,DB_VERSION);
		this.context = context; 

	}

	@Override
	public void onCreate(SQLiteDatabase p1)
	{
		Log.d(TAG, "onCreate");
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase p1, int p2, int p3)
	{
		// TODO: Implement this method
	}	
	
	// onupgrade
	// int oldVer ,final int newVer)
	
	private void execSqlFile(SQLiteDatabase db,String fileName)
		

 	{
		InputStream in =null;
		InputStreamReader inread = null;
		BufferedReader buffer = null;
		
		try{
			in=context.getAssets().open(fileName);
			inread=new InputStreamReader(in,"UTF-8");
		    buffer=new BufferedReader(inread);
			
			
		}catch(IOException e){e.printStackTrace();}
		
		
	}
}
