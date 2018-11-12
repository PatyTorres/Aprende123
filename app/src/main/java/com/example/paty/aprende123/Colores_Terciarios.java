package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Colores_Terciarios extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores__terciarios);

       view= this.getWindow().getDecorView();
       view.setBackgroundResource(R.color.md_green_100);
    }
    public void AmarilloVerdoso (View v)
    {
        view.setBackgroundResource(R.color.md_light_green_A700);
    }
    public void AzulVerdoso (View v)
    {
        view.setBackgroundResource(R.color.md_teal_700);
    }
    public void AzulViolaceo(View v)
    {
        view.setBackgroundResource(R.color.md_deep_purple_400);
    }
    public void RojoAnaranjado (View v)
    {
        view.setBackgroundResource(R.color.md_deep_orange_600);
    }
    public void RojoViolaceo(View v)
    {
        view.setBackgroundResource(R.color.md_pink_A700);
    }

    public void AmarilloAnaranjado(View v)
    {
        view.setBackgroundResource(R.color.md_yellow_700);
    }

    public void colores_terciarios(View v) {

    }
    public void menu_ensenanza(View v){
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
