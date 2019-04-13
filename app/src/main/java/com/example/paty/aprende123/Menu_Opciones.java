package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__opciones);
    }
    public void datos_eliminar(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Consultar_Datos_Estudiante_Eliminar.class);
        //Inicia el intento
        startActivity(i);
    }
    public void modificar_datos(View v){

        Intent i = new Intent(this, Consultar_Datos_Estudiante_Modificar.class );
        startActivity(i);
    }
    public void ingresar_datos_estudiante(View v){

        Intent i = new Intent(this, Ingresar_Datos_Estudiante.class );
        startActivity(i);
    }
    public void menu(View v){
        Intent i = new Intent(this, Menu.class);

        startActivity(i);

    }
    public void consultar_datos(View v){
        Intent i = new Intent(this, Consultar_Datos.class);

        startActivity(i);

    }
    public void menu_opciones(View v){

    }
}
