package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Menu extends AppCompatActivity {

    //Ésta es una funcion que tienen cualquier Activity (Una pantalla de Android), y se ejecuta cuando se "Crea"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llama al constructor de la clase AppCompatActivity, a la que está extendida éste objeto
        super.onCreate(savedInstanceState);

        //Utiliza el layout "activity_menu" como diseño de la pantalla
        setContentView(R.layout.activity_menu);

        //Al botón exit_button, se le agrega un listener, que ejecuta algo cuando se le de click
        final Button boton_salida = (Button)findViewById(R.id.exit_button);
        boton_salida.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cierra la pantalla actual, y regresa a la pantalla de inicio
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                //Borra el historial de ventanas abiertas, para no poder darle regresar
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }
    public void menu(View v) {

    }

    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void menu_ensenanza(View v) {
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Menu_Ensenanza.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }

    public void menu_evaluaciones(View v) {
        Intent i = new Intent(this, StartingScreenActivity.class);

        startActivity(i);

    }

    public void menu_opciones(View v) {
        Intent i = new Intent(this, Menu_Opciones.class);

        startActivity(i);

    }
    public void ayuda(View v){
        Intent i = new Intent(this, Ayuda.class);

        startActivity(i);

    }

    public void menu_actividad(View v) {
        Intent i = new Intent(this, Menu_Actividad.class);

        startActivity(i);

    }
    public void a_cerca_de(View v) {
        Intent i = new Intent(this, A_Cerca_de.class);

        startActivity(i);

    }

}