package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A_Cerca_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_cerca_de);
    }
    public void a_cerca_de(View v) {

    }
    public void menu(View v) {
        Intent i = new Intent(this, Menu.class);

        startActivity(i);

    }
}
