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

    public void actividad_conteo2(View v) {
        Intent i = new Intent(this, Actividad_Conteo2.class);

        startActivity(i);

    }

}
