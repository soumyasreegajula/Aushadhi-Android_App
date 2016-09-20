package com.aushadhi;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase; 
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

    public class database2 
    {
	public static final String KEY_ROWID = "_id";
	public static final String KEY_SYMPTOM1 = "symptom1";
	public static final String KEY_SYMPTOM2 = "symptom2";
	public static final String KEY_SYMPTOM3 = "symptom3";
	public static final String KEY_SYMPTOM4 = "symptom4";
	public static final String KEY_SYMPTOM5 = "symptom5";
	
	public static final String KEY_MEDICINE = "medicine";
    public static final String DISEASE1 = "tip";
    public static final String TREATMENT = "treatment";
    
    
    
	private static final String TAG = "database";

	private static final String DATABASE_NAME = "aushadhi";
	private static final String DATABASE_TABLE1 = "symptoms";
	
	
	private static final int DATABASE_VERSION = 1;

	public static final String DATABASE_CREATE1 = "create table  "+DATABASE_TABLE1+" (_id integer primary key autoincrement, "
		+ "symptom1 text not null,symptom2 text,symptom3 text,symptom4 text,symptom5 text,tip text,treatment text,"+"medicine text not null);";
	
	
	
	
	
	
	private final Context context;

	private static DatabaseHelper DBHelper;
	private static SQLiteDatabase db;

	public database2(Context ctx)
	{
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}
	
	
	

	private static class DatabaseHelper extends SQLiteOpenHelper
	{
		DatabaseHelper(Context context)
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		
		
		

		@Override
	public void onCreate(SQLiteDatabase db) 
		{
			db.execSQL(DATABASE_CREATE1);
						
		}

		
		
		@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
		{
			Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
					+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE1);
			
						onCreate(db);
		}

	}
	
	
	

	// ---opens the database---
	public database2 open() throws SQLException 
	{
		db = DBHelper.getWritableDatabase();
		return this;
	}
	
	
	

	// ---closes the database---
	public void close() 
	{
		DBHelper.close();
	}

	

	// ---inserts symptoms into the database---
	

	public long insertSymptom1(String symptom1, String symptom2,String symptom3,String symptom4,String symptom5,String tip,String treatment,String medicine)
	{
		ContentValues initialValues = new ContentValues();
		initialValues.put(KEY_SYMPTOM1, symptom1);
		initialValues.put(KEY_SYMPTOM2, symptom2);
		initialValues.put(KEY_SYMPTOM3, symptom3);
		initialValues.put(KEY_SYMPTOM4, symptom4);
		initialValues.put(KEY_SYMPTOM5, symptom5);
		
		initialValues.put(DISEASE1, tip);
		initialValues.put(TREATMENT, treatment);
		initialValues.put(KEY_MEDICINE, medicine);
		return db.insert(DATABASE_TABLE1, null, initialValues);
	}
	
	
	//-----SCREEN1----
	
	
	
	
	public Cursor Submit(String symptoms1) throws SQLException 
	{
		Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
				+ " WHERE symptom1= ? ", new String[] { symptoms1});

		if (mCursor != null) 
		{
			if (mCursor.getCount() > 0)
			{
				return mCursor;
			}
		}
		return mCursor;

	}
	    

	
	
	
	public Cursor Submitt1(String symptom1)throws SQLException
	{
	Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
		+ " WHERE symptom1=?", new String[] {
		symptom1 });

	if (mCursor != null)
	{
	if (mCursor.getCount() > 0)
		{
		return mCursor;
		}
	}
	return mCursor;
	}
	
	
	
	//-----SCREEN2----	
	

	
	public Cursor Submit2(String symptoms1, String symptoms2)throws SQLException 
	{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
		+ " WHERE symptom1=? AND symptom2=? ", new String[] {
		symptoms1, symptoms2 });

if (mCursor != null)
{
	if (mCursor.getCount() > 0) 
	{
		return mCursor;
	}
}
return mCursor;
}
	
	
	
	

	public Cursor Submitt2(String symptoms1, String symptoms2)throws SQLException 
	{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
		+ " WHERE symptom1= ? AND symptom2=?", new String[] {
		symptoms1, symptoms2 });

if (mCursor != null) 
{
	if (mCursor.getCount() > 0) 
	{
		return mCursor;
	}
}
return mCursor;
}

	//-----SCREEN3----


public Cursor Submit3(String symptoms1, String symptoms2,String symptoms3)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=?", new String[] {
symptoms1, symptoms2,symptoms3 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0) 
{
return mCursor;
}
}
return mCursor;
}



public Cursor Submitt3(String symptoms1, String symptoms2,String symptoms3)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=? ", new String[] {
symptoms1, symptoms2,symptoms3 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0)
{
return mCursor;
}
}
return mCursor;
}



//----Screen4----




public Cursor Submit4(String symptoms1, String symptoms2,String symptoms3,String symptoms4)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=?AND symptom4=?", new String[] {
symptoms1, symptoms2,symptoms3,symptoms4 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0) 
{
return mCursor;
}
}
return mCursor;
}



public Cursor Submitt4(String symptoms1, String symptoms2,String symptoms3,String symptoms4)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=? AND symptom4=?", new String[] {
symptoms1, symptoms2,symptoms3,symptoms4 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0)
{
return mCursor;
}
}
return mCursor;
}

//---Screen5---

public Cursor Submit5(String symptoms1, String symptoms2,String symptoms3,String symptoms4,String symptoms5)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=?AND symptom4=?AND symptom5=?", new String[] {
symptoms1, symptoms2,symptoms3,symptoms4,symptoms5 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0) 
{
return mCursor;
}
}
return mCursor;
}



public Cursor Submitt5(String symptoms1, String symptoms2,String symptoms3,String symptoms4,String symptoms5)throws SQLException 
{
Cursor mCursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE1
+ " WHERE symptom1= ? AND symptom2=? AND symptom3=? AND symptom4=? AND symptom5=?", new String[] {
symptoms1, symptoms2,symptoms3,symptoms4,symptoms5 });

if (mCursor != null) 
{
if (mCursor.getCount() > 0)
{
return mCursor;
}
}
return mCursor;
}


 }




 


