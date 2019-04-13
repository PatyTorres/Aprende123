package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad_Conteo_Practica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conteo__practica);

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    //Es una función que solo va sumando de uno en uno, cada vez que se presione un botón que esté en "activity_actividad__conteo__practica"
    public void perform_action(View v)
    {
        //Los findViewById busca los elementos que son .xml, o componentes dentro del .xml que tienen un id
        //Este es un TextView (como un label) que está buscando un componente con el nombre text_view y lo está "Casteando" (de Cast en inglés) a la clase TextView
        //Es un label que muestra la cantidad de cliks que se ha dado
        TextView tv = (TextView) findViewById(R.id.text_view);

        //Se obtiene el texto del TextView y se convierte a String, y se guarda en la variable tv_text
        String tv_text = tv.getText().toString();

        //Ya que el texto obtenido es un número, se convierte a entero para operaciones numéricas
        int tv_number = Integer.parseInt(tv_text);

        //Se incrementa el número de cliks
        int numberOfClick = tv_number+1;


        String tv_new_text = numberOfClick + "";

        //Se muestr en el label la cantidad de cliks que tiene, ahora con un +1 sumado
        tv.setText(tv_new_text);
    }
    public void actividad_conteo_practica(View v) {

    }
    //Es una función que recibe un parametro view (Para que desde el XML pueda poner en la opción onClick, el nombre de ésta función
    //Sin los parametros (View v) ésto no funcionaría
    public void actividad_conteo(View v) {
        //Intent es un objeto que Inicia una nueva ventana, de acuerdo al contexto (Ventana en ejecución)
        //Se le pasa el contexto y luego la qué clase que se quiera abrir (Otra activity)
        Intent i = new Intent(this, Actividad_Conteo.class);
        //Inicia el intento de abrir la pantalla
        startActivity(i);

    }
}
