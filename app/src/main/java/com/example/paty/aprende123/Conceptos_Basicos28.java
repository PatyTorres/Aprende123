package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Conceptos_Basicos28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceptos__basicos28);
    }
    public void conceptos_basicos28(View v) {

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }

}
