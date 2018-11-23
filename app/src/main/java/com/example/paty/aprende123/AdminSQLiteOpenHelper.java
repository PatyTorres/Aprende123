package com.example.paty.aprende123;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table estudiantes(campoIdentificacion integer primary key, campoNombre text, campoGrado text, campoEdad int, campoDiscapacidad text, campoEspecificaciones text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists estudiantes ");
        db.execSQL("create table estudiantes(campoIdentificacion integer primary key, campoNombre text, campoGrado text, campoEdad int, campoDiscapacidad text, campoEspecificaciones text)");


    }
}
