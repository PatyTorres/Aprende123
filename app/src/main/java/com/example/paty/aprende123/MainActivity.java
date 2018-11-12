package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void insert(View v){
        Intent i = new Intent(this, Ingresar_Datos_Estudiante.class);

        startActivity(i);

    }
    public void consultar(View v){
        Intent i = new Intent(this, Consultar_Datos_Estudiante.class);

        startActivity(i);

    }
    public void menu(View v){
        Intent i = new Intent(this, Menu.class);

        startActivity(i);

    }

}
