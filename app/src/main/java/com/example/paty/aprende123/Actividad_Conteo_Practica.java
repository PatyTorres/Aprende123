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

        TextView tv = (TextView) findViewById(R.id.text_view);

        String tv_text = tv.getText().toString();


        int tv_number = Integer.parseInt(tv_text);


        int numberOfClick = tv_number+1;


        String tv_new_text = numberOfClick + "";


        tv.setText(tv_new_text);
    }
    public void actividad_conteo_practica(View v) {

    }
    public void actividad_conteo(View v) {
        Intent i = new Intent(this, Actividad_Conteo.class);

        startActivity(i);

    }
}
