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

        // Get the widgets reference from XML layout
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        final Button btn = (Button) findViewById(R.id.btn);

        // Set a click listener for Button widget
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                    LayoutParams are used by views to tell
                    their parents how they want to be laid out

                    public ViewGroup.LayoutParams getLayoutParams ()
                        Get the LayoutParams associated with this view.
                        All views should have layout parameters.
                        These supply parameters to the parent of this view
                        specifying how it should be arranged. There are many
                        subclasses of ViewGroup.LayoutParams, and these correspond
                        to the different subclasses of ViewGroup that are
                        responsible for arranging their children.
                 */
                LayoutParams lp = (LayoutParams) btn.getLayoutParams();
                /*
                    addRule(int verb)
                        Adds a layout rule to be interpreted by the RelativeLayout.
                        This method should only be used for constraints that don't
                        refer to another sibling (e.g., CENTER_IN_PARENT) or take
                        a boolean value (TRUE for true or 0 for false).

                    addRule(int verb, int anchor)
                        Adds a layout rule to be interpreted by the RelativeLayout.
                        Use this for verbs that take a target, such as a sibling
                        (ALIGN_RIGHT) or a boolean value (VISIBLE).

                    ALIGN_PARENT_BOTTOM
                        Rule that aligns the child's bottom edge
                        with its RelativeLayout parent's bottom edge.
                */
                lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

                /*
                public void setLayoutParams (ViewGroup.LayoutParams params)
                    Set the layout parameters associated with this view.
                    These supply parameters to the parent of this view specifying
                    how it should be arranged. There are many subclasses of
                    ViewGroup.LayoutParams, and these correspond to the different
                    subclasses of ViewGroup that are responsible
                    for arranging their children.
                 */
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
