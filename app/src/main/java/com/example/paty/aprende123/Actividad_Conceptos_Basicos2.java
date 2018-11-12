package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Actividad_Conceptos_Basicos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conceptos__basicos2);

        // Get reference of widgets from XML layout
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        Button btn_top = (Button) findViewById(R.id.btn_top);
        Button btn_bottom = (Button) findViewById(R.id.btn_bottom);
        Button btn_right = (Button) findViewById(R.id.btn_right);
        Button btn_left = (Button) findViewById(R.id.btn_left);
        Button btn_center = (Button) findViewById(R.id.btn_center);

        // Make the Toast message
        final Toast toast = Toast.makeText(
                getApplicationContext(), // Context
                "Simple Toast", // Message
                Toast.LENGTH_SHORT // Short Duration
        );

        btn_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    setGravity(int gravity, int xOffset, int yOffset)
                        Set the location at which the notification should appear on the screen.
                 */
                toast.setGravity(Gravity.TOP,0,10);

                // Set the Toast message
                toast.setText("POSICIÓN: ARRIBA");

                // Show the Toast on app interface
                toast.show();
            }
        });

        btn_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setGravity(Gravity.BOTTOM,0,10);
                toast.setText("POSICIÓN: ABAJO");
                toast.show();
            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setGravity(Gravity.RIGHT,10,0);
                toast.setText("POSICIÓN: DERECHO");
                toast.show();
            }
        });

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setGravity(Gravity.LEFT,10,0);
                toast.setText("POSICIÓN: IZQUIERDO");
                toast.show();
            }
        });

        btn_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
                toast.setText("POSICIÓN: CENTRO");
                toast.show();
            }
        });
    }


    public void actividad_conceptos_basicos2(View v) {

    }
    public void menu_actividad(View v){
        Intent i = new Intent(this, Menu_Actividad.class);

        startActivity(i);

    }

}
