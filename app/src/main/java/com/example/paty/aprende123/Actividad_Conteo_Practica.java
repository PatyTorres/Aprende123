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
    public void perform_action(View v)
    {
 /*
  the following example code demonstrate us
  how can we convert integer value string and
  how can we also convert string to integer value
  */

        TextView tv = (TextView) findViewById(R.id.text_view);

        //get the textview text as String variable
        String tv_text = tv.getText().toString();

        //convert string to integer value
        int tv_number = Integer.parseInt(tv_text);

        //add 1 with current textview text
        int numberOfClick = tv_number+1;

        //convert the number to string
        //String tv_new_text = Integer.toString(numberOfClick);

        //another way to convert the integer value to string
        //String tv_new_text = String.valueOf(numberOfClick);

        //another way to convert the integer value to string
        String tv_new_text = numberOfClick + "";

        //finally the textview will display the button's number of click
        tv.setText(tv_new_text);
    }
    public void actividad_conteo_practica(View v) {

    }
    public void actividad_conteo(View v) {
        Intent i = new Intent(this, Actividad_Conteo.class);

        startActivity(i);

    }
}
