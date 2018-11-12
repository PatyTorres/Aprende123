package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;


public class Actividad_Operaciones2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__operaciones2);

    }
    public void actividad_operaciones2(View v) {

    }
    public void menu_actividad(View v) {
        Intent i = new Intent(this, Menu_Actividad.class);

        startActivity(i);

    }
}
