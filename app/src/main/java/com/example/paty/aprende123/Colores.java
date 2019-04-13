package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Colores extends AppCompatActivity {
    View view;

    //Ésta es una funcion que tienen cualquier Activity (Una pantalla de Android), y se ejecuta cuando se "Crea"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llama al constructor de la clase AppCompatActivity, a la que está extendida éste objeto
        super.onCreate(savedInstanceState);
        //Utiliza el layout "activity_colores" como diseño de la pantalla
        setContentView(R.layout.activity_colores);

        //Esto es el fondo de la ventana, en el que pone un color por defecto
        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.md_blue_grey_100);
    }

    //Éstas son funciones, que ponen el color del fondo, cuando se presione un botón (Bsucar en el layout (activity_colorores)
    public void azul (View v)
    {
        view.setBackgroundResource(R.color.md_blue_A700);
    }
    public void amarillo (View v)
    {
        view.setBackgroundResource(R.color.md_yellow_A700);
    }
    public void rojo(View v)
    {
        view.setBackgroundResource(R.color.md_red_A700);
    }

    public void colores(View v) {

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void colores_secundarios(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Colores_Secundarios.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }
}
