package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class Actividad_Conceptos_Basicos extends AppCompatActivity {

    //Ésta es una funcion que tienen cualquier Activity (Una pantalla de Android), y se ejecuta cuando se "Crea"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llama al constructor de la clase AppCompatActivity, a la que está extendida éste objeto
        super.onCreate(savedInstanceState);

        //Utiliza el layout "activity_actividad__conceptos__basicos" como diseño de la pantalla
        setContentView(R.layout.activity_actividad__conceptos__basicos);

        //Los findViewById busca los elementos que son .xml, o componentes dentro del .xml que tienen un id
        //Éste es un Layout, que sirve para organizar visualmente los componentes (Anque aquí no está haciendo nada nada)
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        //El id del botón, dentro del layout "activity_actividad__conceptos__basicos", es btn, y es lo que android busca en el xml para usarlo en ésta clase
        final Button btn = (Button) findViewById(R.id.btn);

        //Agrega un listener al boton, para hacer algo cuando le den click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Los layout organizan los componentes dentro de la ventana, y cada elemento tamibén tiene relación con los layout
                LayoutParams lp = (LayoutParams) btn.getLayoutParams();
                //éstas lineas definen que el botón se alinee hasta la parte de abajo del conenedor padre que tenga.
                lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                btn.setLayoutParams(lp);
            }
        });
    }

    public void actividad_conceptos_basicos(View v){

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void actividad_conceptos_basicos2(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Actividad_Conceptos_Basicos2.class);

        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }
}
