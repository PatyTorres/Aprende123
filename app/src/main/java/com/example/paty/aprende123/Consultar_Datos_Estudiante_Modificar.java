package com.example.paty.aprende123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Consultar_Datos_Estudiante_Modificar extends AppCompatActivity {
    private EditText et1,et2,et3,et4,et5,et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar__datos__estudiante__modificar);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
    }
    public void ingresar(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "ProyectoAprende", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cod = et1.getText().toString();
        String nom = et2.getText().toString();
        String grado = et3.getText().toString();
        String edad = et4.getText().toString();
        String disc = et5.getText().toString();
        String espec = et6.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("campoIdentificacion", cod);
        registro.put("campoNombre", nom);
        registro.put("campoGrado", grado);
        registro.put("campoEdad", edad);
        registro.put("campoDiscapacidad", disc);
        registro.put("campoEspecificaciones", espec);
        bd.insert("estudiantes", null, registro);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        Toast.makeText(this, "Se guardaron los datos del estudiante",
                Toast.LENGTH_SHORT).show();
    }

    public void consultaporcodigo(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "ProyectoAprende", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cod = et1.getText().toString();
        Cursor fila = bd.rawQuery(
                "select campoNombre, campoGrado, campoEdad, campoDiscapacidad, campoEspecificaciones from estudiantes where campoIdentificacion=" + cod, null);
        if (fila.moveToFirst()) {
            et2.setText(fila.getString(0));
            et3.setText(fila.getString(1));
            et4.setText(fila.getString(2));
            et5.setText(fila.getString(3));
            et6.setText(fila.getString(4));

        } else
            Toast.makeText(this, "No existe la identificación ingresada, inténtelo nuevamente.",
                    Toast.LENGTH_SHORT).show();
        bd.close();
    }
    public void modificacion(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "ProyectoAprende", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String cod = et1.getText().toString();
        String nom = et2.getText().toString();
        String grado = et3.getText().toString();
        String edad = et4.getText().toString();
        String disc = et5.getText().toString();
        String espec = et6.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("campoIdentificacion", cod);
        registro.put("campoNombre", nom);
        registro.put("campoGrado", grado);
        registro.put("campoEdad", edad);
        registro.put("campoDiscapacidad", disc);
        registro.put("campoEspecificaciones", espec);
        int cant = bd.update("estudiantes", registro, "campoIdentificacion=" + cod, null);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
        et5.setText("");
        et6.setText("");
        if (cant == 1)
            Toast.makeText(this, "Se actualizaron los datos del estudiante correctamente.", Toast.LENGTH_SHORT)
                    .show();
        else
            Toast.makeText(this, "No existe la identificación ingresada, inténtelo nuevamente.",
                    Toast.LENGTH_SHORT).show();

    }

    public void modificar_datos(View v){


    }
    public void menu_opciones(View v){
        Intent i = new Intent(this, Menu_Opciones.class);

        startActivity(i);

    }
}
