package com.example.paty.aprende123;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.animation.ObjectAnimator;


public class Actividad_Figuras_Geometricas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__figuras_geometricas);
        Button btn = (Button) findViewById(R.id.btn);
        final TextView tv = (TextView) findViewById(R.id.tv);

        //Agrega un listener al boton, para hacer algo cuando le den click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Es una animación que rota el textView que se buscó, y lo hace en 5 segundos
                ObjectAnimator anim = ObjectAnimator.ofFloat(tv,"rotation",4000);
                //Aquí se define en milisegundos la duración
                anim.setDuration(5000);
                //Inicia la animación
                anim.start();
            }
        });
    }
    public void actividad_figuras_geometricas(View v) {

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void menu_actividad(View v){
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Menu_Actividad.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }
}
