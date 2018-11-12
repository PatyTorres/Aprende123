package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Botón de salida (final de la aplicación)
        final Button boton_salida = (Button)findViewById(R.id.exit_button);
        boton_salida.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }
    public void menu(View v) {

    }

    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

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
    public void salir(View v) {
        Intent i = new Intent(this, Salir.class);

        startActivity(i);

    }

}