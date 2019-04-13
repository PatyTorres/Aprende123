package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Ensenanza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__ensenanza);
    }
    public void menu_ensenanza(View v) {

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void conteo(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Conteo.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }
    public void colores(View v){
        Intent i = new Intent(this, Colores.class);

        startActivity(i);

    }
    public void conceptos_basicos(View v){
        Intent i = new Intent(this, Conceptos_Basicos.class);

        startActivity(i);

    }
    public void figuras_geometricas(View v){
        Intent i = new Intent(this, Figuras_Geometricas.class);

        startActivity(i);

    }
    public void operaciones(View v){
        Intent i = new Intent(this, Operaciones.class);

        startActivity(i);

    }
    public void menu(View v) {
        Intent i = new Intent(this, Menu.class);

        startActivity(i);
    }
}
