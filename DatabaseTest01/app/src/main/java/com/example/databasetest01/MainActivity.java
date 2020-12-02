package com.example.databasetest01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mycontacts.db";
    private static final int DATABASE_VERSION = 2;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY" + " AUTOINCREMENT, name TEXT, tel TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
    }
}

public class MainActivity extends AppCompatActivity {

    DBHelper helper;
    SQLiteDatabase db;
    EditText edit_name, edit_tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException e) {
            db =helper.getReadableDatabase();
            // e.printStackTrace();
        }

        edit_name = findViewById(R.id.name);
        edit_tel = findViewById(R.id.tel);
    }

    public void insert(View view) {
        String name = edit_name.getText().toString();
        String tel = edit_tel.getText().toString();
        db.execSQL("INSERT INTO contacts VALUES (null, '"+name+"', '"+tel+"' )");

        Toast.makeText(getApplicationContext(), "성공적으로 추가되었음", Toast.LENGTH_LONG).show();
        edit_name.setText("");
        edit_tel.setText("");
    }

    public void search(View view) {
        String name = edit_name.getText().toString();
        Cursor cursor;
        cursor = db.rawQuery("SELECT name, tel FROM contacts WHERE name = '"+name+"';", null);

        while (cursor.moveToNext()) {
            String tel = cursor.getString(1);
            edit_tel.setText(tel);
        }
    }
}