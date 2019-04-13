package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Conceptos_Basicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceptos_basicos);


        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        //Busca el boton con id btn dentro de activity_operaciones
        Button btn = (Button) findViewById(R.id.btn);
        //Busca el componente que muestra imágenes ImageView , dentro del activity_operaciones
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        //Agrega una cción cuando se le de click al botón btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Busca la imagen "cb_derecha" y lo coloca en el componente ImageView
                iv.setImageDrawable(getDrawable(R.drawable.cb_derecha));
            }
        });
    }
    public void conceptos_basicos(View v) {

    }
    public void conceptos_basicos2(View v) {
        Intent i = new Intent(this, Conceptos_Basicos2.class);

        startActivity(i);

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
