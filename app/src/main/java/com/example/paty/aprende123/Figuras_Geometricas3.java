package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Figuras_Geometricas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras__geometricas3);
    }
    public void figuras_geometricas3(View v){

    }
    public void figuras_geometricas4(View v){
        Intent i = new Intent(this, Figuras_Geometricas4.class);

        startActivity(i);

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
