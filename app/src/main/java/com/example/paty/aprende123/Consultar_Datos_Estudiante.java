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

public class Consultar_Datos_Estudiante extends AppCompatActivity {

    private EditText var1, var2, var3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar__datos__estudiante);
        var1=(EditText)findViewById(R.id.campoIdentificacion);
        var2=(EditText)findViewById(R.id.campoNombre);
        var3=(EditText)findViewById(R.id.campoGrado);


    }

    public void consultaEstudiante(View view){
        if (var1.getText().length()==0){
            var1.setError("Ingresa la Identificación");

        }
        else
            {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
                SQLiteDatabase db=admin.getWritableDatabase();
                String campoIdentificacion=var1.getText().toString();

                Cursor fila= db.rawQuery("select campoNombre, campoGrado from estudiantes where campoIdentificacion = " + campoIdentificacion, null);

                if(fila.moveToFirst()){

                var2.setText(fila.getString(0));
                var3.setText(fila.getString(1));

            }
            else
                {
                    Toast.makeText(this, "El Estudiante no ha sido Ingresado", Toast.LENGTH_SHORT).show();
                    db.close();
                }

    }

}

public void Eliminar(View v){
        if(var1.getText().length()==0){
            var1.setError("Ingresar la Identificación");

        }
        else
        {
            AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
            SQLiteDatabase db=admin.getWritableDatabase();
            String campoIdentificacion=var1.getText().toString();

            int conteo=db.delete("estudiantes", "campoIdentificacion=" + campoIdentificacion, null);
            db.close();

            var1.setText("");
            var2.setText("");
            var3.setText("");

            if(conteo==1)
                Toast.makeText(this, "Se borro la información del Estudiante", Toast.LENGTH_SHORT).show();

            else
            {
                Toast.makeText(this, "No existe ese Estudiante", Toast.LENGTH_SHORT).show();
            }
        }

}

public void modificar(View v){
    if(var1.getText().length()==0){
        var1.setError("Ingresar la Identificación");

    }
    else
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String campoIdentificacion=var1.getText().toString();
        String campoNombre=var2.getText().toString();
        String campoGrado=var3.getText().toString();

        ContentValues datos= new ContentValues();

        datos.put("campoIdentificacion", campoIdentificacion);
        datos.put("campoNombre", campoNombre);
        datos.put("campoGrado", campoGrado);
        int conteo=db.update("estudiantes", datos, "campoIdentificacion" + campoIdentificacion, null);
        db.close();

        var1.setText("");
        var2.setText("");
        var3.setText("");

        if (conteo==1)
            Toast.makeText(this, "Se modificaron los datos del estudiante", Toast.LENGTH_SHORT).show();

        else
        {
            Toast.makeText(this, "No existe ese estudiante", Toast.LENGTH_SHORT).show();

        }
    }

}


}


