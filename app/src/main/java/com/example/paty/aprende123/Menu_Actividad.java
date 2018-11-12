package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Actividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__actividad);
    }
    public void menu_actividad(View v) {

    }

    public void actividad_conceptos_basicos(View v){
        Intent i = new Intent(this, Actividad_Conceptos_Basicos.class);

        startActivity(i);

    }
    public void actividad_conteo_practica(View v) {
        Intent i = new Intent(this, Actividad_Conteo_Practica.class);

        startActivity(i);

    }
    public void actividad_figuras_geometricas(View v) {
        Intent i = new Intent(this, Actividad_Figuras_Geometricas.class);

        startActivity(i);

    }
    public void actividad_operaciones(View v) {
        Intent i = new Intent(this, Actividad_Operaciones.class);

        startActivity(i);

    }
    public void menu(View v) {
        Intent i = new Intent(this, Menu.class);

        startActivity(i);

    }

}
