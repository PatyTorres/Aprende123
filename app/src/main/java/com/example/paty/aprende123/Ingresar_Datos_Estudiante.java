package com.example.paty.aprende123;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Ingresar_Datos_Estudiante extends AppCompatActivity {


    private EditText var1, var2,var3,var4,var5,var6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar__datos__estudiante);
        var1=(EditText)findViewById(R.id.campoIdentificacion);
        var2=(EditText)findViewById(R.id.EditTextNombre);
        var3=(EditText)findViewById(R.id.EditTextGrado);
        var4=(EditText)findViewById(R.id.EditTextEdad);
        var5=(EditText)findViewById(R.id.EditTextDiscapacidad);
        var6=(EditText)findViewById(R.id.EditTextEspecificaciones);
    }

    public void insert(View v){
        if(var1.getText().length()==0){
            var1.setError("Ingresar la Identificación del Alumno");
        }
        if(var2.getText().length()==0){
            var2.setError("Ingresar el Nombre del Alumno");
        }
        if(var3.getText().length()==0){
            var3.setError("Ingresar el Grado que cursa el Alumno");
        }
        if(var4.getText().length()==0){
            var4.setError("Ingresar la Edad del Alumno");
        }
        if(var5.getText().length()==0){
            var5.setError("Ingresar la Discapacidad del Alumno");
        }
        if(var6.getText().length()==0){
            var6.setError("Ingresar las Especificaciones de la Discapacidad");
        }

        else
        {
            AdminSQLiteOpenHelper admin= new AdminSQLiteOpenHelper(this, "administracion", null,1);
            SQLiteDatabase bd = admin.getWritableDatabase();

            String campoIdentificacion=var1.getText().toString();
            String campoNombre=var2.getText().toString();
            String campoGrado=var3.getText().toString();
            String campoEdad=var4.getText().toString();
            String campoDiscapacidad=var5.getText().toString();
            String campoEspecificaciones=var6.getText().toString();

            Cursor fila = bd.rawQuery("select * from estudiantes where campoIdentificacion =" + campoIdentificacion, null);

            if(!fila.moveToFirst()){
                ContentValues datos=new ContentValues();
                datos.put("campoIdentificacion", campoIdentificacion);
                datos.put("campoNombre", campoNombre);
                datos.put("campoGrado", campoGrado);
                datos.put("campoEdad", campoEdad);
                datos.put("campoDiscapacidad", campoDiscapacidad);
                datos.put("campoEspecificaciones", campoEspecificaciones);
                bd.insert("estudiantes", null, datos);
                bd.close();
                var1.setText("");
                var2.setText("");
                var3.setText("");
                var4.setText("");
                var5.setText("");
                var6.setText("");

                Toast.makeText(this, "Se ha ingresado los datos del Estudiante correctamente", Toast.LENGTH_SHORT).show();

            }

        }

    }
    public void principal(View v){

        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
    public void ingresar_datos_estudiante(View v){


    }
}
