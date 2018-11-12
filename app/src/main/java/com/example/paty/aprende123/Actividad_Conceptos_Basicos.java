package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class Actividad_Conceptos_Basicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__conceptos__basicos);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        final Button btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutParams lp = (LayoutParams) btn.getLayoutParams();

                lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

                btn.setLayoutParams(lp);
            }
        });
    }

    public void actividad_conceptos_basicos(View v){

    }
    public void actividad_conceptos_basicos2(View v){
        Intent i = new Intent(this, Actividad_Conceptos_Basicos2.class);

        startActivity(i);

    }
}
