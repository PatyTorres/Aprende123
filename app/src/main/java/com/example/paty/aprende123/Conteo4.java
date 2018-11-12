package com.example.paty.aprende123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Conteo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteo4);

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
                iv.setImageDrawable(getDrawable(R.drawable.num4));
            }
        });
    }
    public void conteo4(View v) {

    }
    public void conteo5(View v) {
        Intent i = new Intent(this, Conteo5.class);

        startActivity(i);

    }
    public void menu_ensenanza(View v) {
        Intent i = new Intent(this, Menu_Ensenanza.class);

        startActivity(i);

    }
}
