package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Conteo10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo10);

        // Get the widgets reference from XML layout
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        Button btn = (Button) findViewById(R.id.btn);
        final ImageView iv = (ImageView) findViewById(R.id.iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    public void setImageDrawable (Drawable drawable)
                        Sets a drawable as the content of this ImageView.

                        Parameters
                        drawable : the Drawable to set, or null to clear the content
                */

                /*
                    public Drawable getDrawable (int id)
                        Return a drawable object associated with a particular resource ID.
                        Various types of objects will be returned depending on the
                        underlying resource -- for example, a solid color, PNG image,
                        scalable image, etc. The Drawable API hides these implementation details.
                */

                // Set ImageView image from drawable resource
                iv.setImageDrawable(getDrawable(R.drawable.num10));
            }
        });
    }
    public void conteo10(View v) {

    }
    /*public void conteo11(View v) {
        Intent i = new Intent(this, Conteo11.class);

        startActivity(i);

    }*/
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
