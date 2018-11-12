package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad_Unidad_Medida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__unidad__medida);
    }

    public void actividad_unidad_medida2(View v) {
        Intent i = new Intent(this, Actividad_unidad_medida2.class);

        startActivity(i);

    }
}
