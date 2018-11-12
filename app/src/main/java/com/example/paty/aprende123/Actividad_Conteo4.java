package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad_Conteo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conteo4);
    }
    public void actividad_conteo4(View v) {

    }

    public void actividad_conteo5(View v) {
        Intent i = new Intent(this, Actividad_Conteo5.class);

        startActivity(i);

    }
}
