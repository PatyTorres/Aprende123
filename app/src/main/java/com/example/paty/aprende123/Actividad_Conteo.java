package com.example.paty.aprende123;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Actividad_Conteo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conteo);
    }

    public void actividad_conteo(View v) {

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void actividad_conteo2(View v) {
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Actividad_Conteo2.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }

}
