package com.example.paty.aprende123;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    //Esta es una clase que ayuda a administrar la base de datos SQLite
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //Cuando se cree la clase, crea inmediatamente la tabla estudiantes
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table estudiantes(campoIdentificacion integer primary key, campoNombre text, campoGrado text, campoEdad int, campoDiscapacidad text, campoEspecificaciones text)");

    }

    //Cuando se actualiza (la aplicación supongo), elimina la tabla estudiantes y la vuelve a crear
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists estudiantes ");
        db.execSQL("create table estudiantes(campoIdentificacion integer primary key, campoNombre text, campoGrado text, campoEdad int, campoDiscapacidad text, campoEspecificaciones text)");


    }
}
