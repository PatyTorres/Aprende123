package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Conceptos_Basicos8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceptos__basicos8);

        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        Button btn = (Button) findViewById(R.id.btn);
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv.setImageDrawable(getDrawable(R.drawable.cb_detras));
            }
        });
    }
    public void conceptos_basicos8(View v) {

    }
    public void conceptos_basicos9(View v) {
        Intent i = new Intent(this, Conceptos_Basicos9.class);

        startActivity(i);

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
