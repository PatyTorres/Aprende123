package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad_Conteo5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conteo5);
    }
    public void actividad_conteo5(View v) {

    }

    public void menu_actividad(View v) {
        Intent i = new Intent(this, Menu_Actividad.class);

        startActivity(i);

    }
}
