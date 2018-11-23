package com.example.paty.aprende123;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Consultar_Datos extends AppCompatActivity {
    private EditText var1, var2, var3, var4, var5, var6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar__datos);
        var1=(EditText)findViewById(R.id.campoIdentificacion);
        var2=(EditText)findViewById(R.id.EditTextNombre);
        var3=(EditText)findViewById(R.id.EditTextGrado);
        var4=(EditText)findViewById(R.id.EditTextEdad);
        var5=(EditText)findViewById(R.id.EditTextDiscapacidad);
        var6=(EditText)findViewById(R.id.EditTextEspecificaciones);
    }
    public void consultaEstudiante(View view){
        if (var1.getText().length()==0){
            var1.setError("Ingresa la Identificación");

        }
        else
        {
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "ProyectoAprende", null, 1);
            SQLiteDatabase bd=admin.getWritableDatabase();
            String campoIdentificacion=var1.getText().toString();

            Cursor fila= bd.rawQuery("select campoNombre, campoGrado, campoEdad, campoDiscapacidad, campoEspecificaciones from estudiantes where campoIdentificacion = " + campoIdentificacion, null);

            if(fila.moveToFirst()){

                var2.setText(fila.getString(0));
                var3.setText(fila.getString(1));
                var4.setText(fila.getString(2));
                var5.setText(fila.getString(3));
                var6.setText(fila.getString(4));
            }
            else
            {
                Toast.makeText(this, "El Estudiante no ha sido Ingresado", Toast.LENGTH_SHORT).show();
                bd.close();
            }

        }

    }

    public void consultar_datos(View v){


    }
    public void menu_opciones(View v){
        Intent i = new Intent(this, Menu_Opciones.class);

        startActivity(i);

    }
}
