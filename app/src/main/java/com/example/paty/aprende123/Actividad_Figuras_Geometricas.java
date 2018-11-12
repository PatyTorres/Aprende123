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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator anim = ObjectAnimator.ofFloat(tv,"rotation",4000);
                anim.setDuration(5000);
                anim.start();
            }
        });
    }
    public void actividad_figuras_geometricas(View v) {

    }
    public void menu_actividad(View v){
        Intent i = new Intent(this, Menu_Actividad.class);

        startActivity(i);

    }
}
