package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Colores extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.md_blue_grey_100);
    }
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
    public void colores_secundarios(View v){
        Intent i = new Intent(this, Colores_Secundarios.class);

        startActivity(i);

    }
}
