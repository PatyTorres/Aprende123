package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        //Busca el boton con id btn dentro de activity_operaciones
        Button btn = (Button) findViewById(R.id.btn);
        //Busca el componente que muestra imágenes ImageView , dentro del activity_operaciones
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        //Agrega una cción cuando se le de click al botón btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Busca la imagen "uno" y lo coloca en el componente ImageView
                iv.setImageDrawable(getDrawable(R.drawable.uno));
            }
        });
    }
    public void operaciones(View v) {

    }
    public void operaciones2(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Operaciones2.class);
        //Inicia el intento
        startActivity(i);

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
