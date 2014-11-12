package com.example.disaster;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Asthma extends ActionBarActivity {

    //declaration of widgets in layout
    Button guidelines, firstaid, redcross;
    TextView line,line1,line2,line3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //set activity layout
        setContentView(R.layout.activity_asthma);

        //assinging buttons from layout

        guidelines =(Button) findViewById(R.id.guidelines);
        firstaid = (Button) findViewById(R.id.firstaid);
        redcross = (Button) findViewById(R.id.redcross);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        line3 = (TextView) findViewById(R.id.line3);


        guidelines.setBackgroundColor(Color.GRAY);
        firstaid.setBackgroundColor(Color.RED);
        redcross.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
        line2.setBackgroundColor(Color.GRAY);
        line3.setBackgroundColor(Color.GRAY);
   
        //on clicking guidelines button
        guidelines.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Asthma.this, Guidelines.class));
                finish();
            }
        });


        //on clicking firstaid button
        firstaid.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Asthma.this, Firstaid.class));
                finish();
            }
        });

        redcross.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Asthma.this, Redcross.class));
                finish();
            }
        });





    }



}