package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Colores_Secundarios extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores__secundarios);

        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.md_pink_50);
    }
    public void violeta (View v)
    {
        view.setBackgroundResource(R.color.md_purple_700);
    }
    public void verde (View v)
    {
        view.setBackgroundResource(R.color.md_green_700);
    }
    public void naranja(View v)
    {
        view.setBackgroundResource(R.color.md_orange_A700);
    }



    public void colores_secundarios(View v) {

    }

    public void colores_terciarios(View v){
        Intent i = new Intent(this, Colores_Terciarios.class);

        startActivity(i);

    }
}
